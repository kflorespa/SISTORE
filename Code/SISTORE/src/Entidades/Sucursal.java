package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Sucursal {
int IDSUCURSAL;
int IDTIENDA;
String DESCRIPCION;
String DIRECCION;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

    public int getIDSUCURSAL() {
        return IDSUCURSAL;
    }

    public void setIDSUCURSAL(int IDSUCURSAL) {
        this.IDSUCURSAL = IDSUCURSAL;
    }

    public int getIDTIENDA() {
        return IDTIENDA;
    }

    public void setIDTIENDA(int IDTIENDA) {
        this.IDTIENDA = IDTIENDA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
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


    public Sucursal(int IDSUCURSAL, int IDTIENDA, String DESCRIPCION, String DIRECCION, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDSUCURSAL = IDSUCURSAL;
        this.IDTIENDA = IDTIENDA;
        this.DESCRIPCION = DESCRIPCION;
        this.DIRECCION = DIRECCION;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
    }

    public Sucursal() {
    }
    
        public String [] DatosArray(){
        String [] lista = new String[9];
        lista[0]=String.valueOf(IDSUCURSAL);
        lista[1]=String.valueOf(IDTIENDA);
        lista[2]=DESCRIPCION;
        lista[3]=DIRECCION;
        lista[4]=Formatos.sdf.format(FCHCREA);
        lista[5]=USRCREA;
        lista[6]=Formatos.sdf.format(FCHMOD);
        lista[7]=USRMOD;
        lista[8]=String.valueOf(FLGELI);
        return lista;
    } 

    public Sucursal(String DESCRIPCIONLARGA) {
        this.DESCRIPCION = DESCRIPCIONLARGA;
    }
}
