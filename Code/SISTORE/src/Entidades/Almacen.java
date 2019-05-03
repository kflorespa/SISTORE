package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Almacen {
    int IDALMACEN;
    int IDSUCURSAL;
    String DESCRIPCION;
    Date FCHCREA;
    String USRCREA;
    Date FCHMOD;
    String USRMOD;
    char FLGELI;

    public Almacen() {
    }

    public Almacen(int IDALMACEN, int IDSUCURSAL, String DESCRIPCION, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDALMACEN = IDALMACEN;
        this.IDSUCURSAL = IDSUCURSAL;
        this.DESCRIPCION = DESCRIPCION;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
    }

    public int getIDALMACEN() {
        return IDALMACEN;
    }

    public void setIDALMACEN(int IDALMACEN) {
        this.IDALMACEN = IDALMACEN;
    }

    public int getIDSUCURSAL() {
        return IDSUCURSAL;
    }

    public void setIDSUCURSAL(int IDSUCURSAL) {
        this.IDSUCURSAL = IDSUCURSAL;
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

        public String [] DatosArray(){
        String [] lista = new String[8];
        lista[0]=String.valueOf(IDALMACEN);
        lista[1]=String.valueOf(IDSUCURSAL);
        lista[2]=DESCRIPCION;
        lista[3]=Formatos.sdf.format(FCHCREA);
        lista[4]=USRCREA;
        lista[5]=Formatos.sdf.format(FCHMOD);
        lista[6]=USRMOD;
        lista[7]=String.valueOf(FLGELI);
        return lista;
    }
}
