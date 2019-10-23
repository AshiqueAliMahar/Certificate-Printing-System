package BalClasses;

import BeanClasses.CDetailBean;
import DBConnections.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class NMCBal {
    
    DBConnection dBConnection = new DBConnection();


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

            certificateDetail.setCertificateNo(0);

        }

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT issuecpsnumber FROM applicantcertificate WHERE issueCertificateName='NoMarriage';");
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

    public CDetailBean search(String CNIC) {

        CDetailBean arr = null;
        Connection con = dBConnection.getCon();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT c.`ApplicantID`,c.`ApplicantName`,c.`ApplicantRelation`,c.`ApplicantCNIC`,c.`DateOfBirth`,c.`FatherName`,c.`Gender`,c.`HusbandCNIC`,c.`HusbandName`,c.`MaritalStatus`,c.`Mobile`,c.`OptionalCNIC`,c.`SurName`,ac.applicantAddress,ac.districtName,ac.talukaName,ac.wardNumber,ac.recommendedBy,ac.recommendPerson FROM applicantdetails c INNER JOIN applicantcertificate ac ON(c.ApplicantID=ac.ApplicantId) WHERE c.ApplicantCNIC='"+CNIC+"';");

            while (rs.next()) {
                arr =new CDetailBean();
                arr.setId(rs.getInt(1));
                arr.setAppName(rs.getString(2));
                arr.setAppRelation(rs.getString(3));
                arr.setAppCNIC(rs.getString(4));
                arr.setDateOfBirth(rs.getString(5));
                arr.setFatherName(rs.getString(6));
                arr.setGender(rs.getString(7));
                arr.setHusbandCNIC(rs.getString(8));
                arr.setHusbandName(rs.getString(9));
                arr.setMaritalStatus(rs.getString(10));
                arr.setMobile(rs.getString(11));
                arr.setOptionalCNIC(rs.getString(12));
                arr.setSurName(rs.getString(13));
                arr.setAppAddress(rs.getString(14));
                arr.setDistrictName(rs.getString(15));
                arr.setTaluka(rs.getString(16));
                arr.setWardNum(rs.getInt(17));
                arr.setRecommendedBy(rs.getString(18));
                arr.setRecommededPerson(rs.getString(19));
            
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return arr;
    }

    
    
}
