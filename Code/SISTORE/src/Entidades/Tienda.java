/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import AD.tienda;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author kflores
 */
public class Tienda {
    public DefaultComboBoxModel Listar(){
        return new tienda().Listar();
    }
}
