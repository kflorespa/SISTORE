/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AD;

import Entidades.Tienda;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anroq
 */
public class tienda{
    
    private int idtienda;
    private String tienda;

    public tienda(int idtienda, String tienda) {
        this.idtienda = idtienda;
        this.tienda = tienda;
    }

    public int getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(int idtienda) {
        this.idtienda = idtienda;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
   /* public List tienda(Tienda log){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        
        String sql = "call sp_get_tienda()";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List ListItem=new ArrayList();
            while(rs.next()) {
                Tienda item = new Tienda();
                item.setIdEmpresa(rs.getInt("IdTienda"));
                item.setEmpresa(rs.getString("Nombre"));
                ListItem.add(item);
            }
            
            return ListItem;
            
        } catch (SQLException e){
            System.err.println(e);
            return null;
        }
    }*/
    
    public DefaultComboBoxModel Listar(){
        conexionMS cn = new conexionMS();
        Connection con = cn.conexion();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        String[] registro = new String[2];
        
        try{
            String sql = "call sp_get_tienda()";
            CallableStatement proc = con.prepareCall(sql);
            proc.execute();

            ResultSet rs = proc.executeQuery();
            while(rs.next()){
               modelo.addElement(new tienda(rs.getInt(1),rs.getString(2)));
            }
        return modelo;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e + "error aqui");
            return null;
        }
        
        
    }
}
