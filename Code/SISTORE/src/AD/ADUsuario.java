package AD;

import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author kflores
 */
public class ADUsuario {
        
    private static boolean Nuevo(Usuario u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "insert into usuario values (?,?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            // ps.setInt(1, u.getCoduser());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Usuario u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "update usuario set nomape=?, email=?, estado=? where iduser=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            // ps.setInt(1, u.getCoduser());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Existe(Usuario u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "select usuario from tusuario where usuario=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setString(1, u.getUSUARIO());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    private static boolean Baja(Usuario u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "delete from usuario where iduser=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
           // ps.setInt(1, u.getCoduser());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Comprobar(Usuario u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "SELECT TU.USUARIO FROM TUSUARIO TU INNER JOIN TSUCURSAL_USUARIO TSU ON TU.IDUSUARIO=TSU.IDUSUARIO WHERE TU.USUARIO=? AND TU.CLAVE=? AND TSU.IDSUCURSAL=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){ 
            ps.setString(1, u.getUSUARIO());
            ps.setString(2, u.getCLAVE());
            ps.setInt(3, u.getIDSUCURSAL());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    /*-------------------------------------------------------------------------*/
    
    public static boolean Guardar(Usuario u) throws ClassNotFoundException, SQLException{
        if (Existe(u)) {    
        return Actualizar(u);
        }else{
        
            return Nuevo(u);    
        }
    }
       
    public static boolean Login(Usuario u) throws ClassNotFoundException, SQLException{
        if (Existe(u)) {    
        return Comprobar(u);
    }else{
            return false;  
        }
    }
    
    public static boolean Eliminar(Usuario u) throws ClassNotFoundException, SQLException{
            return Baja(u);
    }
    
    public static LinkedList<Usuario> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Usuario> lista = new LinkedList<>();
    String sql = "select*from usuario";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                //lista.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                }
            }            
        }
    return lista;
    }
}
