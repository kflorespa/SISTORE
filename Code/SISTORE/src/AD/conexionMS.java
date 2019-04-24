package AD;

import java.sql.Connection;
import java.sql.Statement;

public class conexionMS {
    public String db="FINADB";
    public String url="jdbc:sqlserver://;databaseName="+db;
    public String user="sa";
    public String pass="12345";
    Connection cn = null;
    Statement sn;
    
    public Connection conexion() {
        return cn;
    }
    
    public Statement sentencia(){
        return sn;
    }
    
}
