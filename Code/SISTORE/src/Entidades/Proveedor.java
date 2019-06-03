package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Proveedor {
int IDPROVEEDOR;
String RUC;
String RAZONSOCIAL;
String DIRECCION;
String TELEFONO;
String RUBRO;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

String FLEJE;

    public String getFLEJE() {
        return FLEJE;
    }

    public void setFLEJE(String FLEJE) {
        this.FLEJE = FLEJE;
    }

    public int getIDPROVEEDOR() {
        return IDPROVEEDOR;
    }

    public void setIDPROVEEDOR(int IDPROVEEDOR) {
        this.IDPROVEEDOR = IDPROVEEDOR;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getRAZONSOCIAL() {
        return RAZONSOCIAL;
    }

    public void setRAZONSOCIAL(String RAZONSOCIAL) {
        this.RAZONSOCIAL = RAZONSOCIAL;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getRUBRO() {
        return RUBRO;
    }

    public void setRUBRO(String RUBRO) {
        this.RUBRO = RUBRO;
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


    public Proveedor(int IDPROVEEDOR, String RUC, String RAZONSOCIAL, String DIRECCION, String TELEFONO, String RUBRO, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, String FLEJE,char FLGELI) {
        this.IDPROVEEDOR = IDPROVEEDOR;
        this.RUC = RUC;
        this.RAZONSOCIAL = RAZONSOCIAL;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.RUBRO = RUBRO;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
        this.FLEJE = FLEJE;
    }

    public Proveedor() {
    }

        public String [] DatosArray(){
        String [] lista = new String[12];
        lista[0]=String.valueOf(IDPROVEEDOR);
        lista[1]=RUC;
        lista[2]=RAZONSOCIAL;
        lista[3]=DIRECCION;
        lista[4]=TELEFONO;
        lista[5]=RUBRO;
        lista[6]=Formatos.sdf.format(FCHCREA);
        lista[7]=USRCREA;
        lista[8]=Formatos.sdf.format(FCHMOD);
        lista[9]=USRMOD;
        lista[10]=FLEJE;
        lista[11]=String.valueOf(FLGELI);
        return lista;
    } 

}
