/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Tabla {
int IDTABLA;
String DESCRIPCION;
char FLGELI;

    public Tabla(int IDTABLA, String DESCRIPCION, char FLGELI) {
        this.IDTABLA = IDTABLA;
        this.DESCRIPCION = DESCRIPCION;
        this.FLGELI = FLGELI;
    }

        
    public Tabla() {
    }

    
    public int getIDTABLA() {
        return IDTABLA;
    }

    public void setIDTABLA(int IDTABLA) {
        this.IDTABLA = IDTABLA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }
        public String [] DatosArray(){
        String [] lista = new String[3];
        lista[0]=String.valueOf(IDTABLA);
        lista[1]=String.valueOf(DESCRIPCION);
        lista[2]=String.valueOf(FLGELI);
        return lista;
    } 
        
}
