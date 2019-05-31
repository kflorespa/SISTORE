package AD;

import Entidades.Categoria;
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
public class ADCategoria {
        private static boolean Nuevo(Categoria u) throws ClassNotFoundException, SQLException, ParseException{
    int r = 0;
    String sql = "INSERT INTO tcategoria VALUES (?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, u.getDESCRIPCION());
            ps.setInt(2, u.getDIARETIRO());
            ps.setString(3, String.valueOf(u.getFLGELI()));
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Categoria u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "update TCATEGORIA set DESCRIPCION=?,DIARETIRO=?,FLGELI=? where IDCATEGORIA=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setString(1, u.getDESCRIPCION());
            ps.setInt(2, u.getDIARETIRO());
            ps.setString(3, String.valueOf(u.getFLGELI()));
            ps.setInt(4, u.getIDCATEGORIA());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    

    private static boolean Baja(Categoria u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TCATEGORIA SET FLGELI=? WHERE IDCATEGORIA=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getFLGELI());
            ps.setInt(1, u.getIDCATEGORIA());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    

    /*-------------------------------------------------------------------------*/
    public static boolean Existe(Categoria u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "SELECT IDCATEGORIA fROM TCATEGORIA WHERE IDCATEGORIA=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDCATEGORIA());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    public static boolean Guardar(Categoria u) throws ClassNotFoundException, SQLException, ParseException{
        if (Existe(u)) {    
        return Actualizar(u);
        }else{
            return Nuevo(u);    
        }
    }

    public static boolean Eliminar(Categoria u) throws ClassNotFoundException, SQLException{
            return Baja(u);
    }
    public static LinkedList<Categoria> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Categoria> lista = new LinkedList<>();
    String sql = "SELECT IDCATEGORIA,DIARETIRO,DESCRIPCION,FLGELI fROM TCATEGORIA t WHERE t.FLGELI='0'";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Categoria(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4).charAt(0)));
                }
            }            
        }
    return lista;
    }
}
