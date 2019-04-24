package AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionSS {
    public String db="DBSISTORE";
    public String url="jdbc:sqlserver://;databaseName="+db;
    public String user="sa";
    public String pass="12345";
    Connection cn = null;
    Statement sn;
    
     
    public Connection conexion() {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de autenticación database");
        }
        return cn;
    }
    
    public Statement sentencia(){
        try {
            sn=conexion().createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No hay conexión");
        }
        return sn;
    }
    
}
