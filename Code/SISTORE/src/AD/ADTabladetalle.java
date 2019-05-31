/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ADTabladetalle {
    
    
        private static boolean Nuevo(Tabladetalle u) throws ClassNotFoundException, SQLException, ParseException{
    int r = 0;
    String sql = "INSERT INTO TABLADETALLE VALUES (?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setInt(1, u.getIDTABLA());
            ps.setString(2, u.getDESCRIPCION());
            ps.setInt(3, u.getFLGELI());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Tabladetalle u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TABLADETALLE SET IDTABLA=?,DESCRIPCION=?,FLGELI=? WHERE IDTABLADETALLE=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDTABLA());
            ps.setString(2, u.getDESCRIPCION());
            ps.setInt(3, u.getFLGELI());
            ps.setInt(4, u.getIDTABLADETALLE());
            r = ps.executeUpdate();           
        }
    return r==1;
    }

    
    private static boolean Baja(Tabladetalle u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "UPDATE TABLADETALLE SET FLGELI=? WHERE IDTABLADETALLE=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getFLGELI());
            ps.setInt(2, u.getIDTABLADETALLE());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    

    /*-------------------------------------------------------------------------*/
        
    public static boolean Existe(Tabladetalle u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "SELECT IDTABLADETALLE fROM TABLADETALLE WHERE IDTABLADETALLE=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDTABLADETALLE());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    public static boolean Guardar(Tabladetalle u) throws ClassNotFoundException, SQLException, ParseException{
        if (Existe(u)) {    
        return Actualizar(u);
        }else{
            return Nuevo(u);    
        }
    }

    public static boolean Eliminar(Tabladetalle u) throws ClassNotFoundException, SQLException{
            return Baja(u);
    }
    
       public static LinkedList<Tabladetalle> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Tabladetalle> lista = new LinkedList<>();
    String sql = "SELECT IDTABLADETALLE,TA.IDTABLA,TD.DESCRIPCION,TD.FLGELI FROM TABLADETALLE TD inner join TTABLA TA ON TD.IDTABLA=TA.IDTABLA WHERE TD.FLGELI='0'";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Tabladetalle(rs.getInt(1),rs.getInt(2),rs.getString(3), rs.getString(4).charAt(0)));
                }
            }            
        }
    return lista;
    }
}
