/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BalClasses;

import BeanClasses.CDetailBean;
import DBConnections.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class IncomeCBal {
    
    DBConnection dBConnection=new DBConnection();
    
    public void addRecord(CDetailBean cDetailBean, boolean b) {

        Connection con = dBConnection.getCon();
        try {
            
            Statement createStatement = con.createStatement();
            ResultSet rs = createStatement.executeQuery("SELECT ApplicantID FROM applicantdetails where ApplicantCNIC='" + cDetailBean.getAppCNIC() + "';");
            int applicantId = 0;
            rs.next();
            applicantId = rs.getInt(1);
            if (!b) {
                createStatement.executeUpdate("INSERT INTO applicantdetails(ApplicantName,ApplicantRelation,ApplicantCNIC,DateOfBirth,FatherName,Gender,HusbandCNIC,HusbandName,MaritalStatus,Mobile,OptionalCNIC,SurName)VALUES ('" + cDetailBean.getAppName() + "','" + cDetailBean.getAppRelation() + "','" + cDetailBean.getAppCNIC() + "','" + cDetailBean.getDateOfBirth() + "','" + cDetailBean.getFatherName() + "','" + cDetailBean.getGender() + "','" + cDetailBean.getHusbandCNIC() + "','" + cDetailBean.getHusbandName() + "','" + cDetailBean.getMaritalStatus() + "','" + cDetailBean.getMobile() + "','" + cDetailBean.getOptionalCNIC() + "','" + cDetailBean.getSurName() + "');");
            } else {
                createStatement.executeUpdate("UPDATE applicantdetails SET ApplicantName='" + cDetailBean.getAppName() + "',ApplicantRelation='" + cDetailBean.getAppRelation() + "',ApplicantCNIC='" + cDetailBean.getAppCNIC() + "',DateOfBirth='" + cDetailBean.getDateOfBirth() + "',FatherName='" + cDetailBean.getFatherName() + "',Gender='" + cDetailBean.getGender() + "',HusbandCNIC='" + cDetailBean.getHusbandCNIC() + "',HusbandName='" + cDetailBean.getHusbandName() + "',MaritalStatus='" + cDetailBean.getMaritalStatus() + "',Mobile='" + cDetailBean.getMobile() + "',OptionalCNIC='" + cDetailBean.getOptionalCNIC() + "',SurName='" + cDetailBean.getSurName() + "' WHERE `ApplicantID` = "+applicantId+";");
            }

            createStatement.executeUpdate("INSERT INTO applicantcertificate(`applicantAddress`,`districtName`,`issueCpsNumber`,`issueCertificateDate`,`issueCertificateDetails`,`issueCertificateName`,`issueCertificateNumber`,`recommendedBy`,`recommendPerson`,`talukaName`,`wardNumber`,`ApplicantId`)VALUES ('" + cDetailBean.getAppAddress() + "','" + cDetailBean.getDistrictName() + "','" + cDetailBean.getIssueCPSNo() + "','" + cDetailBean.getCertificateDate() + "','" + cDetailBean.getCertificateDetails() + "','" + cDetailBean.getCertificateName() + "','" + cDetailBean.getCertificateNo() + "','" + cDetailBean.getRecommendedBy() + "','" + cDetailBean.getRecommededPerson() + "','" + cDetailBean.getTaluka() + "','" + cDetailBean.getWardNum() + "','" + applicantId + "');");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    public CDetailBean getCPSCertificateNO() {

        Connection con = dBConnection.getCon();

        CDetailBean certificateDetail = new CDetailBean();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT issuecertificateNumber FROM applicantcertificate;");
            rs.next();
            certificateDetail.setCertificateNo(rs.getInt(1));

            while (rs.next()) {

                certificateDetail.setCertificateNo(rs.getInt(1));
            }
        } catch (SQLException ex) {
            //System.out.println(ex.getMessage());
            certificateDetail.setCertificateNo(0);

        }

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT issuecpsnumber FROM applicantcertificate WHERE issueCertificateName='income';");
            rs.next();
            certificateDetail.setIssueCPSNo(rs.getInt(1));
            while (rs.next()) {
                certificateDetail.setIssueCPSNo(rs.getInt(1));
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            certificateDetail.setIssueCPSNo(0);
        }
        return certificateDetail;
    }
}
