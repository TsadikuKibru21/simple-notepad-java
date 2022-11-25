
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection 
{
    private static final String url = "jdbc:mysql://localhost:3306/cci1";
    private static final String user = "root";
    private static final String password = "";
    private static final String driver = "com.mysql.jdbc.Driver";
   

    public Connection connMethod() throws ClassNotFoundException {
        Class.forName(driver);
        Connection con = null ;
 
        try {
            con = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "connected");

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error: " + ex);
        }
        return con;
    }
    
}