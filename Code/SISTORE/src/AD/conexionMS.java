package AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionMS {
    
    Statement sn;
    public static Connection cn = null;
    
    public static Connection conexion() {
        try {
String database="db_sistore";
String driver="com.mysql.jdbc.Driver";
String host="localhost";
String port="3306";
String user="root";
String pass="";
String url="jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, pass);
            if (cn != null) {
                JOptionPane.showMessageDialog(null, "CONEXION ESTABLECIDA PRRO");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION","CONEXION DB",JOptionPane.WARNING_MESSAGE);
        }
        return cn;
    }
    
    public Statement sentencia(){
        return sn;
    }
    
}
