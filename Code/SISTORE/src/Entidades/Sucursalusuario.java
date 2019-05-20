package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Sucursalusuario {
int IDSUCURSAL_USUARIO;
int IDSUCURSAL;
int IDUSUARIO;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

    public int getIDSUCURSAL_USUARIO() {
        return IDSUCURSAL_USUARIO;
    }

    public void setIDSUCURSAL_USUARIO(int IDSUCURSAL_USUARIO) {
        this.IDSUCURSAL_USUARIO = IDSUCURSAL_USUARIO;
    }

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

    public Sucursalusuario(int IDSUCURSAL_USUARIO, int IDSUCURSAL, int IDUSUARIO, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDSUCURSAL_USUARIO = IDSUCURSAL_USUARIO;
        this.IDSUCURSAL = IDSUCURSAL;
        this.IDUSUARIO = IDUSUARIO;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
    }

    public Sucursalusuario() {
    }
    
   public String [] DatosArray(){
        String [] lista = new String[8];
        lista[0]=String.valueOf(IDSUCURSAL_USUARIO);
        lista[1]=String.valueOf(IDSUCURSAL);
        lista[2]=String.valueOf(IDUSUARIO);
        lista[3]=Formatos.sdf.format(FCHCREA);
        lista[4]=USRCREA;
        lista[5]=Formatos.sdf.format(FCHMOD);
        lista[6]=USRMOD;
        lista[7]=String.valueOf(FLGELI);
        return lista;
    }   
}
