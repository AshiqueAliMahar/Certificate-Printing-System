package BalClasses;

import DBConnections.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReportingBal {

    DBConnection dBConnection = new DBConnection();

    public int getNoOfCertificates(String start, String end, String Name) {

        Connection con = dBConnection.getCon();
        int count = 0;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT count(issuecertificateid) FROM applicantcertificate WHERE issueCertificateDate BETWEEN STR_TO_DATE('" + start + "','%Y-%m-%d') AND STR_TO_DATE('" + end + "','%Y-%m-%d') AND issueCertificateName='" + Name + "';");
            rs.next();
            count = rs.getInt(1);
            System.out.println(count);
        } catch (SQLException ex) {
            count = 0;
        }
        return count;
    }

    public int getNoOfCertificates(String certificateName) {

        Connection con = dBConnection.getCon();
        int count = 0;
        if (certificateName.equals("all")) {
            try {
                Statement createStatement = con.createStatement();
                ResultSet rs = createStatement.executeQuery("SELECT COUNT(issueCertificateName) FROM applicantcertificate;");
                rs.next();
                count = rs.getInt(1);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try {
                Statement createStatement = con.createStatement();
                ResultSet rs = createStatement.executeQuery("SELECT COUNT(issueCertificateName) FROM applicantcertificate WHERE (issueCertificateName='" + certificateName + "');");
                rs.next();
                count = rs.getInt(1);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return count;
    }

}
