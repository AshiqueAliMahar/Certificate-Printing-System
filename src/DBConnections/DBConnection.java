package DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public Connection getCon(){
        
        String user="root";
        String password="hp15p251nz";
        String url="jdbc:mysql://localhost:3306/cps";
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Failed");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Driver Not Loaded");
        }
        return con;
    }
    
    
}
