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
       
    private static boolean Nuevo(Sucursal s) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "insert into usuario values (?,?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            // ps.setInt(1, s.getCoduser());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Sucursal s) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "update usuario set nomape=?, email=?, estado=? where iduser=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            // ps.setInt(1, u.getCoduser());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Existe(Sucursal s) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "select idsucursal from tsucursal where idsucursal=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, s.getIDSUCURSAL());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    private static boolean Baja(Sucursal s) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "delete from usuario where iduser=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
           // ps.setInt(1, u.getCoduser());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
        /*-------------------------------------------------------------------------*/
    
    public static boolean Guardar(Sucursal s) throws ClassNotFoundException, SQLException{
        if (Existe(s)) {    
        return Actualizar(s);
        }else{
        
            return Nuevo(s);    
        }
    }
    
    public static boolean Eliminar(Sucursal s) throws ClassNotFoundException, SQLException{
            return Baja(s);
    }
    
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
