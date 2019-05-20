package AD;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author kflores
 */
public class ADSucursal {
     
    public static LinkedList<Sucursal> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Sucursal> lista = new LinkedList<>();
    String sql = "SELECT CONCAT(IDSUCURSAL,'-' ,DESCRIPCION) AS DESCRIPCION FROM TSUCURSAL WHERE FLGELI=0";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Sucursal(rs.getString(1)));
                }
            }            
        }
    return lista;
    }
    
}
