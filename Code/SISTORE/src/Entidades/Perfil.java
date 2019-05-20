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

    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }

    public Perfil(int IDPERFIL, String DESCRIPCION, char FLGELI) {
        this.IDPERFIL = IDPERFIL;
        this.DESCRIPCION = DESCRIPCION;
        this.FLGELI = FLGELI;
    }

    public Perfil() {
    }

            public String [] DatosArray(){
        String [] lista = new String[3];
        lista[0]=String.valueOf(IDPERFIL);
        lista[1]=DESCRIPCION;
        lista[2]=String.valueOf(FLGELI);
        return lista;
    }   

}
