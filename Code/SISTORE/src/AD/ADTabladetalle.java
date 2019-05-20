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
import java.util.LinkedList;

/**
 *
 * @author kflores
 */
public class ADTabladetalle {
       public static LinkedList<Tabladetalle> Listar() throws ClassNotFoundException, SQLException{
    LinkedList<Tabladetalle> lista = new LinkedList<>();
    String sql = "SELECT TA.DESCRIPCION AS DESCRIPCIONTABLA,CONCAT(TD.IDTABLADETALLE,'-',TD.DESCRIPCION) AS ITEM FROM TABLADETALLE TD inner join TTABLA TA ON TD.IDTABLA=TA.IDTABLA WHERE TD.FLGELI='0'";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){            
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Tabladetalle(rs.getString(1), rs.getString(2)));
                }
            }            
        }
    return lista;
    }
}
