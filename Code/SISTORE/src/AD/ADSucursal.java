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
    
        public static LinkedList<Sucursal> ListaCompleta() throws ClassNotFoundException, SQLException{
    LinkedList<Sucursal> lista = new LinkedList<>();
    String sql = "SELECT*FROM V_SUCURSALES";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Sucursal(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6).charAt(0), rs.getString(7)));
                }
            }            
        }
    return lista;
    }
    
}
