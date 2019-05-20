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
public class Privilegio {
int IDPRIVILEGIO;
int IDUSUARIO;
int IDVISTA;
char CREAR;
char MODIFICAR;
char IMPRIMIR;
char EXPORTAR;
char FLGELI;

String DESCRIPCION_VISTA;

    public String getDESCRIPCION_VISTA() {
        return DESCRIPCION_VISTA;
    }

    public void setDESCRIPCION_VISTA(String DESCRIPCION_VISTA) {
        this.DESCRIPCION_VISTA = DESCRIPCION_VISTA;
    }

    public int getIDPRIVILEGIO() {
        return IDPRIVILEGIO;
    }

    public void setIDPRIVILEGIO(int IDPRIVILEGIO) {
        this.IDPRIVILEGIO = IDPRIVILEGIO;
    }

    public int getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(int IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public int getIDVISTA() {
        return IDVISTA;
    }

    public void setIDVISTA(int IDVISTA) {
        this.IDVISTA = IDVISTA;
    }

    public char getCREAR() {
        return CREAR;
    }

    public void setCREAR(char CREAR) {
        this.CREAR = CREAR;
    }

    public char getMODIFICAR() {
        return MODIFICAR;
    }

    public void setMODIFICAR(char MODIFICAR) {
        this.MODIFICAR = MODIFICAR;
    }

    public char getIMPRIMIR() {
        return IMPRIMIR;
    }

    public void setIMPRIMIR(char IMPRIMIR) {
        this.IMPRIMIR = IMPRIMIR;
    }

    public char getEXPORTAR() {
        return EXPORTAR;
    }

    public void setEXPORTAR(char EXPORTAR) {
        this.EXPORTAR = EXPORTAR;
    }

    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }

    public Privilegio(int IDPRIVILEGIO, int IDUSUARIO, int IDVISTA, char CREAR, char MODIFICAR, char IMPRIMIR, char EXPORTAR, char FLGELI) {
        this.IDPRIVILEGIO = IDPRIVILEGIO;
        this.IDUSUARIO = IDUSUARIO;
        this.IDVISTA = IDVISTA;
        this.CREAR = CREAR;
        this.MODIFICAR = MODIFICAR;
        this.IMPRIMIR = IMPRIMIR;
        this.EXPORTAR = EXPORTAR;
        this.FLGELI = FLGELI;
    }

    public Privilegio(int IDPRIVILEGIO, String DESCRIPCION_VISTA, char CREAR, char MODIFICAR, char IMPRIMIR, char EXPORTAR) {
        this.IDPRIVILEGIO = IDPRIVILEGIO;
        this.CREAR = CREAR;
        this.MODIFICAR = MODIFICAR;
        this.IMPRIMIR = IMPRIMIR;
        this.EXPORTAR = EXPORTAR;
        this.DESCRIPCION_VISTA = DESCRIPCION_VISTA;
    }

    public Privilegio() {
    }
    
        public String [] DatosArray(){
        String [] lista = new String[8];
        lista[0]=String.valueOf(IDPRIVILEGIO);
        lista[1]=String.valueOf(IDUSUARIO);
        lista[2]=String.valueOf(IDVISTA);
        lista[3]=String.valueOf(CREAR);
        lista[4]=String.valueOf(MODIFICAR);
        lista[5]=String.valueOf(IMPRIMIR);
        lista[6]=String.valueOf(EXPORTAR);
        lista[7]=String.valueOf(FLGELI);
        return lista;
    }   


        public String [] DatosPrivilegios(){
        String [] lista = new String[8];
        lista[0]=String.valueOf(IDPRIVILEGIO);
        lista[3]=DESCRIPCION_VISTA;
        lista[3]=String.valueOf(CREAR);
        lista[4]=String.valueOf(MODIFICAR);
        lista[5]=String.valueOf(IMPRIMIR);
        lista[6]=String.valueOf(EXPORTAR);
        return lista;
    }   

}
