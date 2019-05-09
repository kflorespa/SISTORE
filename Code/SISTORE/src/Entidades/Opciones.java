package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Opciones {
int IDOPCIONES;
int IDMODULO;
String DESCRIPCION;
String USRCREA;
Date FCHCREA;
String USRMOD;
Date FCHMOD;
char FLGELI;

    public int getIDOPCIONES() {
        return IDOPCIONES;
    }

    public void setIDOPCIONES(int IDOPCIONES) {
        this.IDOPCIONES = IDOPCIONES;
    }

    public int getIDMODULO() {
        return IDMODULO;
    }

    public void setIDMODULO(int IDMODULO) {
        this.IDMODULO = IDMODULO;
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


    public Opciones(int IDOPCIONES, int IDMODULO, String DESCRIPCION, String USRCREA, Date FCHCREA, String USRMOD, Date FCHMOD, char FLGELI) {
        this.IDOPCIONES = IDOPCIONES;
        this.IDMODULO = IDMODULO;
        this.DESCRIPCION = DESCRIPCION;
        this.USRCREA = USRCREA;
        this.FCHCREA = FCHCREA;
        this.USRMOD = USRMOD;
        this.FCHMOD = FCHMOD;
        this.FLGELI = FLGELI;
    }


    public Opciones() {
    }
    
        public String [] DatosArray(){
        String [] lista = new String[8];
        lista[0]=String.valueOf(IDOPCIONES);
        lista[1]=String.valueOf(IDMODULO);
        lista[2]=DESCRIPCION;
        lista[3]=USRCREA;
        lista[4]=Formatos.sdf.format(FCHCREA);
        lista[5]=USRMOD;
        lista[6]=Formatos.sdf.format(FCHMOD);
        lista[7]=String.valueOf(FLGELI);
        return lista;
    }   
}
