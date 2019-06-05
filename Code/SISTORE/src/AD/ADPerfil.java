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
public class ADPerfil {
            private static boolean Nuevo(Perfil u) throws ClassNotFoundException, SQLException, ParseException{
    int r = 0;
    String sql = "INSERT INTO TPERFIL VALUES (?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, u.getDESCRIPCION());
            ps.setString(2, String.valueOf(u.getFLGELI()));
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    
    private static boolean Actualizar(Perfil u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = "  UPDATE TPERFIL SET DESCRIPCION=?, FLGELI=? WHERE IDPERFIL=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setString(1, u.getDESCRIPCION());
            ps.setString(2, String.valueOf(u.getFLGELI()));
            ps.setInt(3, u.getIDPERFIL());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    

    /*-------------------------------------------------------------------------*/
    public static boolean Existe(Perfil u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "  SELECT IDPERFIL FROM TPERFIL WHERE IDPERFIL=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDPERFIL());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    public static boolean Guardar(Perfil u) throws ClassNotFoundException, SQLException, ParseException{
        if (Existe(u)) {    
        return Actualizar(u);
        }else{
            return Nuevo(u);    
        }
    }

    public static LinkedList<Perfil> Listapersonalizada() throws ClassNotFoundException, SQLException{
    LinkedList<Perfil> lista = new LinkedList<>();
    String sql = "select IDPERFIL, '' AS FLEJE ,DESCRIPCION, FLGELI from TPERFIL WHERE FLGELI='0'";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Perfil(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4).charAt(0)));
                }
            }            
        }
    return lista;
    }
    
    public static LinkedList<Perfil> Listacompleta() throws ClassNotFoundException, SQLException{
    LinkedList<Perfil> lista = new LinkedList<>();
    String sql = "SELECT * FROM V_PERFILES";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Perfil(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4).charAt(0)));
                }
            }            
        }
    return lista;
    }
}
