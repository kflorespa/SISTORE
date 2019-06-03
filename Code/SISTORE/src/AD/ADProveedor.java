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
public class ADProveedor {
    private static boolean Nuevo(Proveedor u) throws ClassNotFoundException, SQLException, ParseException{
    int r = 0;
    String sql = "INSERT INTO TPROVEEDOR VALUES (?,?,?,?,?,?,?,?,?,?)";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, u.getRUC());
            ps.setString(2, u.getRAZONSOCIAL());
            ps.setString(3, u.getDIRECCION());
            ps.setString(4, u.getTELEFONO());
            ps.setString(5, u.getRUBRO());
            ps.setString(6, u.getFCHMOD());
            ps.setString(7, u.getUSRMOD());
            ps.setString(8, u.getFCHMOD());
            ps.setString(9, u.getUSRMOD());
            ps.setString(10, String.valueOf(u.getFLGELI()));
            r = ps.executeUpdate();            
        }
    return r==1;
    }

    private static boolean Actualizar(Proveedor u) throws ClassNotFoundException, SQLException{
    int r = 0;
    String sql = " UPDATE TPROVEEDOR SET RUC=?,RAZONSOCIAL=?,DIRECCION=?,TELEFONO=?,RUBRO=?,FCHMOD=?,USRMOD=?,FLGELI=? WHERE IDPROVEEDOR=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setString(1, u.getRUC());
            ps.setString(2, u.getRAZONSOCIAL());
            ps.setString(3, u.getDIRECCION());
            ps.setString(4, u.getTELEFONO());
            ps.setString(5, u.getRUBRO());
            ps.setString(6, u.getFCHMOD());
            ps.setString(7, u.getUSRMOD());
            ps.setString(8, String.valueOf(u.getFLGELI()));
            ps.setInt(9, u.getIDPROVEEDOR());
            r = ps.executeUpdate();            
        }
    return r==1;
    }
    

    /*-------------------------------------------------------------------------*/
    public static boolean Existe(Proveedor u) throws ClassNotFoundException, SQLException{
    boolean r = false;
    String sql = "SELECT IDPROVEEDOR FROM TPROVEEDOR WHERE IDPROVEEDOR=?";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            ps.setInt(1, u.getIDPROVEEDOR());
            try (ResultSet rs = ps.executeQuery();){
                r = rs.next();               
            }
        }
    return r==true;
    }
    
    public static boolean Guardar(Proveedor u) throws ClassNotFoundException, SQLException, ParseException{
        if (Existe(u)) {    
        return Actualizar(u);
        }else{
            return Nuevo(u);    
        }
    }

    public static LinkedList<Proveedor> Listacompleta() throws ClassNotFoundException, SQLException{
    LinkedList<Proveedor> lista = new LinkedList<>();
    String sql = "SELECT * FROM V_PROVEEDORES";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getDate(9), rs.getString(10), rs.getString(11), rs.getString(12).charAt(0)));
                }
            }            
        }
    return lista;
    }
}
