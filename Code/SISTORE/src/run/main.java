/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Presentacion.zmenu;
import java.sql.SQLException;
import recursos.dashstyle;

/**
 *
 * @author kflores
 */
public class main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    new dashstyle().estilo_windows();
    new zmenu().setVisible(true);
    }
}
