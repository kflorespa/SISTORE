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
public class ADPrivilegio {
    
        public static LinkedList<Privilegio> Listar(Usuario u) throws ClassNotFoundException, SQLException{
    LinkedList<Privilegio> lista = new LinkedList<>();
    //Procedure
    String sql = "SELECT V.IDVISTA,V.DESCRIPCION,P.CREAR,P.MODIFICAR,P.IMPRIMIR,P.EXPORTAR\n" +
" FROM TUSUARIO U INNER JOIN (TPRIVILEGIO P INNER JOIN TVISTA V ON P.IDVISTA=V.IDVISTA) ON U.IDUSUARIO=P.IDUSUARIO\n" +
" WHERE U.USUARIO=? AND P.FLGELI='0' AND V.FLGELI='0'";
        try (Connection cn = conexionSS.conexion();
            PreparedStatement ps = cn.prepareStatement(sql)){
            ps.setString(1, u.getUSUARIO());
            try (ResultSet rs = ps.executeQuery();){
                while(rs.next()){
                lista.add(new Privilegio(rs.getInt(1), rs.getString(2), rs.getString(3).charAt(0), rs.getString(4).charAt(0), rs.getString(5).charAt(0), rs.getString(6).charAt(0)));
                    }
            }            
        }
    return lista;
    }
    
        
}
