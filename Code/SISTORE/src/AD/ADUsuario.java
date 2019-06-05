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
    String sql = "INSERT INTO TUSUARIO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setInt(1, u.getPERFIL());
            ps.setString(2, u.getUSUARIO());
            ps.setString(3, u.getCLAVE());
            ps.setString(4, u.getEMAIL());
            ps.setString(5, u.getNOMBRES());
            ps.setString(6, u.getAPELLIDOS());
            ps.setString(7, u.getFCHNAC());
            ps.setString(8, u.getDNI());
            ps.setString(9, u.getFCHMOD());
            ps.setString(10, u.getUSRMOD());
            ps.setString(11, u.getFCHMOD());
            ps.setString(12, u.getUSRMOD());
            ps.setString(13, String.valueOf(u.getFLGELI()));
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Usuario u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TUSUARIO SET IDPERFIL=?, USUARIO=?,EMAIL=?,NOMBRES=?,APELLIDOS=?,FCHNAC=?,DNI=?,FCHMOD=?,USRMOD=?,FLGELI=? WHERE IDUSUARIO=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getPERFIL());
            ps.setString(2, u.getUSUARIO());
            ps.setString(3, u.getEMAIL());
            ps.setString(4, u.getNOMBRES());
            ps.setString(5, u.getAPELLIDOS());
            ps.setString(6, u.getFCHNAC());
            ps.setString(7, u.getDNI());
            ps.setString(8, u.getFCHMOD());
            ps.setString(9, u.getUSRMOD());
            ps.setString(10, String.valueOf(u.getFLGELI()));
            ps.setInt(11, u.getIDUSUARIO());
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
    
    private static boolean Comprobar(Usuario u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    //Hacer un procedure
    String sql = "SELECT TU.USUARIO FROM TUSUARIO TU INNER JOIN TSUCURSAL_USUARIO TSU ON \n" +
"TU.IDUSUARIO=TSU.IDUSUARIO WHERE TU.USUARIO=? AND TU.CLAVE=?\n" +
" AND TSU.IDSUCURSAL=? AND TU.FLGELI='0' AND TSU.FLGELI='0'";
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
 
        
    public static boolean resetclave(Usuario u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TUSUARIO SET CLAVE='' WHERE IDUSUARIO=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDUSUARIO());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    public static LinkedList<Usuario> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Usuario> lista = new LinkedList<>();
    String sql = "select*from V_USUARIOS";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12).charAt(0), rs.getDate(13), rs.getString(14), rs.getDate(15), rs.getString(16)));
                }
            }            
        }
    return lista;
    }
}
