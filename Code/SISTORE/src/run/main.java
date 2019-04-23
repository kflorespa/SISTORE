/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Presentacion.zmenu;
import recursos.dashstyle;

/**
 *
 * @author kflores
 */
public class main {
    public static void main(String[] args) {
    new dashstyle().estilo_windows();
    new zmenu().setVisible(true);
    }
}
