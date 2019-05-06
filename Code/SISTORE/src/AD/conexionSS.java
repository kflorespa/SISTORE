package AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionSS {
    Statement sn; 
    
    public static Connection conexion()throws ClassNotFoundException, SQLException {
    Connection cn;
    String db="DBSISTORE";
    String url="jdbc:sqlserver://;databaseName="+db;
    String user="sa";
    String pass="12345";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection(url, user, pass);
        return cn;
    }
    
    public Statement sentencia() throws ClassNotFoundException{
        try {
            sn=conexion().createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede establecer conexión.");
        }
        return sn;
    }
    
}
