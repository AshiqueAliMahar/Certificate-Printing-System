package BalClasses;

import BeanClasses.CDetailBean;
import DBConnections.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PrintSearchBal {

    DBConnection dBConnection = new DBConnection();
    Connection con = dBConnection.getCon();
    CDetailBean cDetailBean = new CDetailBean();

    public ArrayList getcpsNumberCertificateNumber(int cps, int pageNo, String certificateName) {
        String cpsNo = null;
        String certificateNo = null;
        String lblCertificate = null;
        switch (certificateName) {
            case "character":
                lblCertificate = "CC";
                break;
            case "electrol":
                lblCertificate = "EC";
                break;
            case "income":
                lblCertificate = "IC";
                break;
            case "NoMarriage":
                lblCertificate = "NM";
                break;
            case "noc":
                lblCertificate = "NO";
                break;
            case "residence":
                lblCertificate = "RC";
                break;
            default:
                break;
        }

        switch (String.valueOf(pageNo).length()) {
            case 1:
                certificateNo = "MCB0000" + (pageNo);
                break;
            case 2:
                certificateNo = "MCB000" + (pageNo);
                break;
            case 3:
                certificateNo = "MCB00" + (pageNo);
                break;
            case 4:
                certificateNo = "MCB0" + (pageNo);
                break;
            case 5:
                certificateNo = "MCB" + (pageNo);
                break;
            default:
                break;
        }
        switch (String.valueOf(cps).length()) {
            case 1:
                cpsNo = lblCertificate + "-000" + (cps);
                break;
            case 2:
                cpsNo = lblCertificate + "-00" + (cps);
                break;
            case 3:
                cpsNo = lblCertificate + "-0" + (cps);
                break;
            case 4:
                cpsNo = lblCertificate + "-" + (cps);
                break;
            default:
                break;
        }

        ArrayList arr = new ArrayList();
        arr.add(cpsNo);
        arr.add(certificateNo);
        return arr;

    }

    public ArrayList<CDetailBean> getAlldata() {

        ArrayList<CDetailBean> arr = new ArrayList<>();
        try {
            Statement stat = con.createStatement();

            ResultSet rs = stat.executeQuery("SELECT ac.`issueCertificateid`,ad.`ApplicantName`,ad.`ApplicantRelation`,ad.`ApplicantCNIC`,ad.`DateOfBirth`,ad.`FatherName`,ad.`Gender`,ad.`HusbandCNIC`,ad.`HusbandName`,ad.`MaritalStatus`,ad.`Mobile`,ad.`OptionalCNIC`,ad.`SurName`,ac.`applicantAddress`,ac.`districtName`,ac.`issueCpsNumber`,ac.`issueCertificateDate`,ac.`issueCertificateDetails`,ac.`issueCertificateName`,ac.`issueCertificateNumber`,ac.`recommendedBy`,ac.`recommendPerson`,ac.`talukaName`,ac.`wardNumber`FROM applicantdetails ad INNER JOIN applicantcertificate ac ON(ad.ApplicantID=ac.ApplicantId); ");
            while (rs.next()) {
                CDetailBean cDetailBean = new CDetailBean();
                cDetailBean.setApplicantId(rs.getInt(1));
                cDetailBean.setAppName(rs.getString(2));
                cDetailBean.setAppRelation(rs.getString(3));
                cDetailBean.setAppCNIC(rs.getString(4));
                cDetailBean.setDateOfBirth(rs.getString(5));
                cDetailBean.setFatherName(rs.getString(6));
                cDetailBean.setGender(rs.getString(7));
                cDetailBean.setHusbandCNIC(rs.getString(8));
                cDetailBean.setHusbandName(rs.getString(9));
                cDetailBean.setMaritalStatus(rs.getString(10));
                cDetailBean.setMobile(rs.getString(11));
                cDetailBean.setOptionalCNIC(rs.getString(12));
                cDetailBean.setSurName(rs.getString(13));
                cDetailBean.setAppAddress(rs.getString(14));
                cDetailBean.setDistrictName(rs.getString(15));
                cDetailBean.setIssueCPSNo(rs.getInt(16));
                cDetailBean.setCertificateDate(rs.getString(17));
                cDetailBean.setCertificateDetails(rs.getString(18));
                cDetailBean.setCertificateName(rs.getString(19));
                cDetailBean.setCertificateNo(rs.getInt(20));
                cDetailBean.setRecommendedBy(rs.getString(21));
                cDetailBean.setRecommededPerson(rs.getString(22));
                cDetailBean.setTaluka(rs.getString(23));
                cDetailBean.setWardNum(rs.getInt(24));
                arr.add(cDetailBean);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return arr;
    }

    public ArrayList<CDetailBean> getAlldata(String Name) {

        ArrayList<CDetailBean> arr = new ArrayList<>();
        try {
            Statement stat = con.createStatement();

            ResultSet rs = stat.executeQuery("SELECT ac.`issueCertificateid`,ad.`ApplicantName`,ad.`ApplicantRelation`,ad.`ApplicantCNIC`,ad.`DateOfBirth`,ad.`FatherName`,ad.`Gender`,ad.`HusbandCNIC`,ad.`HusbandName`,ad.`MaritalStatus`,ad.`Mobile`,ad.`OptionalCNIC`,ad.`SurName`,ac.`applicantAddress`,ac.`districtName`,ac.`issueCpsNumber`,ac.`issueCertificateDate`,ac.`issueCertificateDetails`,ac.`issueCertificateName`,ac.`issueCertificateNumber`,ac.`recommendedBy`,ac.`recommendPerson`,ac.`talukaName`,ac.`wardNumber`FROM applicantdetails ad INNER JOIN applicantcertificate ac ON(ad.ApplicantID=ac.ApplicantId) WHERE ApplicantName LIKE'%" + Name + "%'; ");
            while (rs.next()) {
                CDetailBean cDetailBean = new CDetailBean();
                cDetailBean.setApplicantId(rs.getInt(1));
                cDetailBean.setAppName(rs.getString(2));
                cDetailBean.setAppRelation(rs.getString(3));
                cDetailBean.setAppCNIC(rs.getString(4));
                cDetailBean.setDateOfBirth(rs.getString(5));
                cDetailBean.setFatherName(rs.getString(6));
                cDetailBean.setGender(rs.getString(7));
                cDetailBean.setHusbandCNIC(rs.getString(8));
                cDetailBean.setHusbandName(rs.getString(9));
                cDetailBean.setMaritalStatus(rs.getString(10));
                cDetailBean.setMobile(rs.getString(11));
                cDetailBean.setOptionalCNIC(rs.getString(12));
                cDetailBean.setSurName(rs.getString(13));
                cDetailBean.setAppAddress(rs.getString(14));
                cDetailBean.setDistrictName(rs.getString(15));
                cDetailBean.setIssueCPSNo(rs.getInt(16));
                cDetailBean.setCertificateDate(rs.getString(17));
                cDetailBean.setCertificateDetails(rs.getString(18));
                cDetailBean.setCertificateName(rs.getString(19));
                cDetailBean.setCertificateNo(rs.getInt(20));
                cDetailBean.setRecommendedBy(rs.getString(21));
                cDetailBean.setRecommededPerson(rs.getString(22));
                cDetailBean.setTaluka(rs.getString(23));
                cDetailBean.setWardNum(rs.getInt(24));
                arr.add(cDetailBean);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return arr;
    }

    public CDetailBean getAllData(String certificateName, int cpsNumber) {
            
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT ac.`issueCertificateid`,ad.`ApplicantName`,ad.`ApplicantRelation`,ad.`ApplicantCNIC`,ad.`DateOfBirth`,ad.`FatherName`,ad.`Gender`,ad.`HusbandCNIC`,ad.`HusbandName`,ad.`MaritalStatus`,ad.`Mobile`,ad.`OptionalCNIC`,ad.`SurName`,ac.`applicantAddress`,ac.`districtName`,ac.`issueCpsNumber`,ac.`issueCertificateDate`,ac.`issueCertificateDetails`,ac.`issueCertificateName`,ac.`issueCertificateNumber`,ac.`recommendedBy`,ac.`recommendPerson`,ac.`talukaName`,ac.`wardNumber`FROM applicantdetails ad INNER JOIN applicantcertificate ac ON(ad.ApplicantID=ac.ApplicantId)WHERE  (issueCertificateName='" + certificateName + "' AND issueCpsNumber=" + cpsNumber + ");");
            cDetailBean=null;
            if (rs.next()) {
                cDetailBean=new CDetailBean();
                cDetailBean.setApplicantId(rs.getInt(1));
                cDetailBean.setAppName(rs.getString(2));
                cDetailBean.setAppRelation(rs.getString(3));
                cDetailBean.setAppCNIC(rs.getString(4));
                cDetailBean.setDateOfBirth(rs.getString(5));
                cDetailBean.setFatherName(rs.getString(6));
                cDetailBean.setGender(rs.getString(7));
                cDetailBean.setHusbandCNIC(rs.getString(8));
                cDetailBean.setHusbandName(rs.getString(9));
                cDetailBean.setMaritalStatus(rs.getString(10));
                cDetailBean.setMobile(rs.getString(11));
                cDetailBean.setOptionalCNIC(rs.getString(12));
                cDetailBean.setSurName(rs.getString(13));
                cDetailBean.setAppAddress(rs.getString(14));
                cDetailBean.setDistrictName(rs.getString(15));
                cDetailBean.setIssueCPSNo(rs.getInt(16));
                cDetailBean.setCertificateDate(rs.getString(17));
                cDetailBean.setCertificateDetails(rs.getString(18));
                cDetailBean.setCertificateName(rs.getString(19));
                cDetailBean.setCertificateNo(rs.getInt(20));
                cDetailBean.setRecommendedBy(rs.getString(21));
                cDetailBean.setRecommededPerson(rs.getString(22));
                cDetailBean.setTaluka(rs.getString(23));
                cDetailBean.setWardNum(rs.getInt(24));
            }
        } catch (Exception ex) {
            System.out.println(PrintSearchBal.class.getName());
        }
        return cDetailBean;

    }

    public CDetailBean getAllData(int certificateNumber) {

        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT ac.`issueCertificateid`,ad.`ApplicantName`,ad.`ApplicantRelation`,ad.`ApplicantCNIC`,ad.`DateOfBirth`,ad.`FatherName`,ad.`Gender`,ad.`HusbandCNIC`,ad.`HusbandName`,ad.`MaritalStatus`,ad.`Mobile`,ad.`OptionalCNIC`,ad.`SurName`,ac.`applicantAddress`,ac.`districtName`,ac.`issueCpsNumber`,ac.`issueCertificateDate`,ac.`issueCertificateDetails`,ac.`issueCertificateName`,ac.`issueCertificateNumber`,ac.`recommendedBy`,ac.`recommendPerson`,ac.`talukaName`,ac.`wardNumber`FROM applicantdetails ad INNER JOIN applicantcertificate ac ON(ad.ApplicantID=ac.ApplicantId)WHERE (issueCertificateNumber=" + certificateNumber + "); ");
            rs.next();
            cDetailBean.setApplicantId(rs.getInt(1));
            cDetailBean.setAppName(rs.getString(2));
            cDetailBean.setAppRelation(rs.getString(3));
            cDetailBean.setAppCNIC(rs.getString(4));
            cDetailBean.setDateOfBirth(rs.getString(5));
            cDetailBean.setFatherName(rs.getString(6));
            cDetailBean.setGender(rs.getString(7));
            cDetailBean.setHusbandCNIC(rs.getString(8));
            cDetailBean.setHusbandName(rs.getString(9));
            cDetailBean.setMaritalStatus(rs.getString(10));
            cDetailBean.setMobile(rs.getString(11));
            cDetailBean.setOptionalCNIC(rs.getString(12));
            cDetailBean.setSurName(rs.getString(13));
            cDetailBean.setAppAddress(rs.getString(14));
            cDetailBean.setDistrictName(rs.getString(15));
            cDetailBean.setIssueCPSNo(rs.getInt(16));
            cDetailBean.setCertificateDate(rs.getString(17));
            cDetailBean.setCertificateDetails(rs.getString(18));
            cDetailBean.setCertificateName(rs.getString(19));
            cDetailBean.setCertificateNo(rs.getInt(20));
            cDetailBean.setRecommendedBy(rs.getString(21));
            cDetailBean.setRecommededPerson(rs.getString(22));
            cDetailBean.setTaluka(rs.getString(23));
            cDetailBean.setWardNum(rs.getInt(24));
        } catch (SQLException ex) {
            System.out.println(PrintSearchBal.class.getName());
        }
        return cDetailBean;

    }
}
