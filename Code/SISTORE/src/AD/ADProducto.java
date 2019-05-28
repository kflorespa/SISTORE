package AD;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.LinkedList;

/**
 *
 * @author kflores
 */
public class ADProducto {
    
    private static boolean Nuevo(Producto u) throws ClassNotFoundException, SQLException, ParseException{
    int r = 0;
    String sql = "INSERT INTO TPRODUCTO VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            u.setUSRCREA(u.getUSRMOD());
            u.setFCHCREA(u.getFCHMOD());
            ps.setInt(1, u.getIDCATEGORIA());
            ps.setInt(2, u.getCODUME());
            ps.setString(3, u.getEAN());
            ps.setString(4, u.getDESCRIPCION());
            ps.setFloat(5, u.getPRECIOCOM());
            ps.setFloat(6, u.getPRECIOVEN());
            ps.setString(7, u.getFCHCREA());
            ps.setString(8, u.getUSRCREA());
            ps.setString(9, u.getFCHMOD());
            ps.setString(10, u.getUSRMOD());
            ps.setString(11, String.valueOf(u.getFLGELI()));
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Producto u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TPRODUCTO SET IDCATEGORIA=?, CODUME=?,EAN=?, DESCRIPCION=?,PRECIOCOM=?,PRECIOVEN=?,FCHMOD=?,USRMOD=?,FLGELI=? WHERE IDPRODUCTO=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDCATEGORIA());
            ps.setInt(2, u.getCODUME());
            ps.setString(3, u.getEAN());
            ps.setString(4, u.getDESCRIPCION());
            ps.setFloat(5, u.getPRECIOCOM());
            ps.setFloat(6, u.getPRECIOVEN());
            ps.setString(7, u.getFCHMOD());
            ps.setString(8, u.getUSRMOD());
            ps.setString(9, String.valueOf(u.getFLGELI()));
            ps.setInt(10, u.getIDPRODUCTO());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Existe(Producto u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "SELECT IDPRODUCTO fROM TPRODUCTO WHERE IDPRODUCTO=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDPRODUCTO());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    private static boolean Baja(Producto u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TPRODUCTO SET FLGELI=? WHERE IDPRODUCTO=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDPRODUCTO());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    

    /*-------------------------------------------------------------------------*/
    
    public static boolean Guardar(Producto u) throws ClassNotFoundException, SQLException, ParseException{
        if (Existe(u)) {    
        return Actualizar(u);
        }else{
            return Nuevo(u);    
        }
    }

    public static boolean Eliminar(Producto u) throws ClassNotFoundException, SQLException{
            return Baja(u);
    }
    
    public static LinkedList<Producto> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Producto> lista = new LinkedList<>();
    String sql = "SELECT * FROM V_PRODUCTOS";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Producto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12).charAt(0), rs.getString(13), rs.getDate(14), rs.getString(15), rs.getDate(16), rs.getString(17)));  
                }
            }            
        }
    return lista;
    }
}
