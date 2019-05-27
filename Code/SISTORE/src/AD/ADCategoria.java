package AD;

import Entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author kflores
 */
public class ADCategoria {
    
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
