package AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionMS {
    public String database="db_sistore";
    public String driver="com.mysql.jdbc.Driver";
    public String host="localhost";
    public String port="3306";
    public String user="root";
    public String pass="";
    public String url="jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";
    
    Connection cn = null;
    Statement sn;
    
    public Connection conexion() {
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, pass);
            if (cn != null) {
                JOptionPane.showMessageDialog(null, "CONEXION ESTABLECIDA PRRO");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION"+e,"CONEXION DB",JOptionPane.WARNING_MESSAGE);
        }
        return cn;
    }
    
    public Statement sentencia(){
        return sn;
    }
    
}
