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
public class Perfil {
int IDPERFIL;
String DESCRIPCION;
String FLEJE;
char FLGELI;

    public int getIDPERFIL() {
        return IDPERFIL;
    }

    public void setIDPERFIL(int IDPERFIL) {
        this.IDPERFIL = IDPERFIL;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getFLEJE() {
        return FLEJE;
    }

    public void setFLEJE(String FLEJE) {
        this.FLEJE = FLEJE;
    }

    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }


    public Perfil(int IDPERFIL, String DESCRIPCION, String FLEJE, char FLGELI) {
        this.IDPERFIL = IDPERFIL;
        this.DESCRIPCION = DESCRIPCION;
        this.FLGELI = FLGELI;
        this.FLEJE = FLEJE;
    }
    

    public Perfil() {
    }

            public String [] DatosArray(){
        String [] lista = new String[4];
        lista[0]=String.valueOf(IDPERFIL);
        lista[1]=DESCRIPCION;
        lista[2]=FLEJE;
        lista[3]=String.valueOf(FLGELI);
        return lista;
    }   
          public String [] Lista(){
        String [] lista = new String[4];
        lista[0]=String.valueOf(IDPERFIL);
        lista[1]=FLEJE;
        lista[2]=DESCRIPCION;
        lista[3]=String.valueOf(FLGELI);
        return lista;
    }  

}
