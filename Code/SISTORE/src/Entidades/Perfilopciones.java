package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Perfilopciones {
int IDPERFIL_OPCIONES;
int IDPERFIL;
int IDOPCIONES;
String USRCREA;
Date FCHCREA;
String USRMOD;
Date FCHMOD;
char FLGELI;

    public int getIDPERFIL_OPCIONES() {
        return IDPERFIL_OPCIONES;
    }

    public void setIDPERFIL_OPCIONES(int IDPERFIL_OPCIONES) {
        this.IDPERFIL_OPCIONES = IDPERFIL_OPCIONES;
    }

    public int getIDPERFIL() {
        return IDPERFIL;
    }

    public void setIDPERFIL(int IDPERFIL) {
        this.IDPERFIL = IDPERFIL;
    }

    public int getIDOPCIONES() {
        return IDOPCIONES;
    }

    public void setIDOPCIONES(int IDOPCIONES) {
        this.IDOPCIONES = IDOPCIONES;
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

    public Perfilopciones(int IDPERFIL_OPCIONES, int IDPERFIL, int IDOPCIONES, String USRCREA, Date FCHCREA, String USRMOD, Date FCHMOD, char FLGELI) {
        this.IDPERFIL_OPCIONES = IDPERFIL_OPCIONES;
        this.IDPERFIL = IDPERFIL;
        this.IDOPCIONES = IDOPCIONES;
        this.USRCREA = USRCREA;
        this.FCHCREA = FCHCREA;
        this.USRMOD = USRMOD;
        this.FCHMOD = FCHMOD;
        this.FLGELI = FLGELI;
    }

    public Perfilopciones() {
    }
    
    public String [] DatosArray(){
        String [] lista = new String[8];
        lista[0]=String.valueOf(IDPERFIL_OPCIONES);
        lista[1]=String.valueOf(IDPERFIL);
        lista[2]=String.valueOf(IDOPCIONES);
        lista[3]=USRCREA;
        lista[4]=Formatos.sdf.format(FCHCREA);
        lista[5]=USRMOD;
        lista[6]=Formatos.sdf.format(FCHMOD);
        lista[7]=String.valueOf(FLGELI);
        return lista;
    }   
}
