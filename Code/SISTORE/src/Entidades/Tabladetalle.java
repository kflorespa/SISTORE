/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author kflores
 */
public class Tabladetalle {
int IDTABLADETALLE;
int IDTABLA;
String DESCRIPCION;
char FLGELI;
/*VARIABLE DE AUXILIAR*/
String DESCRIPCIONTABLA;
String ITEM;

    public String getITEM() {
        return ITEM;
    }

    public void setITEM(String ITEM) {
        this.ITEM = ITEM;
    }

    public String getDESCRIPCIONTABLA() {
        return DESCRIPCIONTABLA;
    }

    public void setDESCRIPCIONTABLA(String DESCRIPCIONTABLA) {
        this.DESCRIPCIONTABLA = DESCRIPCIONTABLA;
    }

    public Tabladetalle() {
    }

    public Tabladetalle(String DESCRIPCIONTABLA, String ITEM) {
        this.DESCRIPCIONTABLA = DESCRIPCIONTABLA;
        this.ITEM = ITEM;
    }

    public Tabladetalle(int IDTABLADETALLE,int IDTABLA,String DESCRIPCION,char FLGELI) {
        this.IDTABLADETALLE = IDTABLADETALLE;
        this.DESCRIPCION = DESCRIPCION;
        this.IDTABLA=IDTABLA;
        this.FLGELI = FLGELI;
    }

    public int getIDTABLADETALLE() {
        return IDTABLADETALLE;
    }

    public void setIDTABLADETALLE(int IDTABLADETALLE) {
        this.IDTABLADETALLE = IDTABLADETALLE;
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
        String [] lista = new String[4];
        lista[0]=String.valueOf(IDTABLADETALLE);
        lista[1]=String.valueOf(IDTABLA);
        lista[2]=String.valueOf(DESCRIPCION);
        lista[3]=String.valueOf(FLGELI);
        return lista;
    } 
        
        public String [] DatosCombo(){
        String [] lista = new String[2];
        lista[0]=String.valueOf(IDTABLADETALLE);
        lista[1]=String.valueOf(ITEM);
        return lista;
    } 
        
        
}
