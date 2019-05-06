package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Perfiles {
int IDPERFIL;
String DESCRIPCION;
String USRCREA;
Date FCHCREA;
String USRMOD;
Date FCHMOD;
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

    public Perfiles(int IDPERFIL, String DESCRIPCION, String USRCREA, Date FCHCREA, String USRMOD, Date FCHMOD, char FLGELI) {
        this.IDPERFIL = IDPERFIL;
        this.DESCRIPCION = DESCRIPCION;
        this.USRCREA = USRCREA;
        this.FCHCREA = FCHCREA;
        this.USRMOD = USRMOD;
        this.FCHMOD = FCHMOD;
        this.FLGELI = FLGELI;
    }

    public Perfiles() {
    }
        public String [] DatosArray(){
        String [] lista = new String[7];
        lista[0]=String.valueOf(IDPERFIL);
        lista[1]=DESCRIPCION;
        lista[2]=USRCREA;
        lista[3]=Formatos.sdf.format(FCHCREA);
        lista[4]=USRMOD;
        lista[5]=Formatos.sdf.format(FCHMOD);
        lista[6]=String.valueOf(FLGELI);
        return lista;
    }   


}
