package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Usuario {
int IDUSUARIO;
int IDPERFIL;
String USUARIO;
String CLAVE;
String EMAIL;
String NOMBRES;
String APELLIDOS;
Date FCHNAC;
String DNI;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

//VARIABLES AUXILIARES
int IDSUCURSAL;
String FLEJE;
String PERFIL;

    public int getIDSUCURSAL() {
        return IDSUCURSAL;
    }

    public void setIDSUCURSAL(int IDSUCURSAL) {
        this.IDSUCURSAL = IDSUCURSAL;
    }

    public int getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(int IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public int getPERFIL() {
        return IDPERFIL;
    }

    public void setPERFIL(int IDPERFIL) {
        this.IDPERFIL = IDPERFIL;
    }


    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(String CLAVE) {
        this.CLAVE = CLAVE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getFCHNAC() {
        return Formatos.sdf.format(FCHNAC);
    }

    public void setFCHNAC(String FCHNAC) throws ParseException{
        this.FCHNAC = Formatos.sdf.parse(FCHNAC);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getFCHCREA() {
        return Formatos.sdf.format(FCHCREA);
    }

    public void setFCHCREA(String FCHCREA) throws ParseException{
        this.FCHCREA = Formatos.sdf.parse(FCHCREA);
    }

    public String getUSRCREA() {
        return USRCREA;
    }

    public void setUSRCREA(String USRCREA) {
        this.USRCREA = USRCREA;
    }

    public String getFCHMOD() {
        return Formatos.sdf.format(FCHMOD);
    }

    public void setFCHMOD(String FCHMOD) throws ParseException{
        this.FCHMOD = Formatos.sdf.parse(FCHMOD);
    }

    public String getUSRMOD() {
        return USRMOD;
    }

    public void setUSRMOD(String USRMOD) {
        this.USRMOD = USRMOD;
    }

    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }
 
    public Usuario(int IDUSUARIO, String DNI, String NOMBRES, String APELLIDOS, Date FCHNAC,int IDPERFIL, String PERFIL, String USUARIO, String CLAVE, String EMAIL, String FLEJE, char FLGELI, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD) {
        this.IDUSUARIO = IDUSUARIO;
        this.IDPERFIL = IDPERFIL;
        this.USUARIO = USUARIO;
        this.CLAVE = CLAVE;
        this.EMAIL = EMAIL;
        this.NOMBRES = NOMBRES;
        this.APELLIDOS = APELLIDOS;
        this.FCHNAC = FCHNAC;
        this.DNI = DNI;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
        this.FLEJE = FLEJE;
        this.PERFIL = PERFIL;
    }



    public Usuario() {
    }
    //String[] columnas = {"IDUSUARIO","DNI","NOMBRES","APELLIDOS","FCHNAC","IDPERFIL","PERFIL","USUARIO","CLAVE","EMAIL","FLEJE","FLGELI","FCHCREA","USRCREA","FCHMOD","USRMOD"};    
    //{15,14,13,12,11,8,5,4,1};
       public String [] DatosArray(){
        String [] lista = new String[16];
        lista[0]=String.valueOf(IDUSUARIO);
        lista[1]=DNI;
        lista[2]=NOMBRES;
        lista[3]=APELLIDOS;
        lista[4]=Formatos.sdf.format(FCHNAC);
        lista[5]=String.valueOf(IDPERFIL);
        lista[6]=String.valueOf(PERFIL);
        lista[7]=USUARIO;
        lista[8]=CLAVE;
        lista[9]=EMAIL;
        lista[10]=String.valueOf(FLEJE);
        lista[11]=String.valueOf(FLGELI);
        lista[12]=Formatos.sdf.format(FCHCREA);
        lista[13]=USRCREA;
        lista[14]=Formatos.sdf.format(FCHMOD);
        lista[15]=USRMOD;
        return lista;
    }   

    
}
