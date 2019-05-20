package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Producto {
int IDPRODUCTO;
int IDCATEGORIA;
int CODUME;
int CODESTADO;
String EAN;
String DESCRIPCION;
float PRECIOCOM;
float PRECIOVEN;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;
String ESTADOLARGA;
String CATEGORIALARGA;
String UMELARGA;

    public int getCODESTADO() {
        return CODESTADO;
    }

    public void setCODESTADO(int CODESTADO) {
        this.CODESTADO = CODESTADO;
    }

    public String getESTADOLARGA() {
        return ESTADOLARGA;
    }

    public void setESTADOLARGA(String ESTADOLARGA) {
        this.ESTADOLARGA = ESTADOLARGA;
    }

    public String getUMELARGA() {
        return UMELARGA;
    }

    public void setUMELARGA(String UMELARGA) {
        this.UMELARGA = UMELARGA;
    }


    public String getCATEGORIALARGA() {
        return CATEGORIALARGA;
    }

    public void setCATEGORIALARGA(String CATEGORIALARGA) {
        this.CATEGORIALARGA = CATEGORIALARGA;
    }

    public int getCODUME() {
        return CODUME;
    }

    public void setCODUME(int CODUME) {
        this.CODUME = CODUME;
    }

    public float getPRECIOCOM() {
        return PRECIOCOM;
    }

    public void setPRECIOCOM(float PRECIOCOM) {
        this.PRECIOCOM = PRECIOCOM;
    }

    public float getPRECIOVEN() {
        return PRECIOVEN;
    }

    public void setPRECIOVEN(float PRECIOVEN) {
        this.PRECIOVEN = PRECIOVEN;
    }


    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public int getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(int IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
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
    
    public Producto() {
    }
 
    public Producto(int IDPRODUCTO,String EAN,String DESCRIPCION, float PRECIOCOM, float PRECIOVEN, String CATEGORIALARGA, String UMELARGA,String ESTADOLARGA,char FLGELI,  Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD) {
        this.IDPRODUCTO = IDPRODUCTO;
        this.CATEGORIALARGA = CATEGORIALARGA;
        this.UMELARGA = UMELARGA;
        this.EAN = EAN;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIOCOM = PRECIOCOM;
        this.PRECIOVEN = PRECIOVEN;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
        this.ESTADOLARGA=ESTADOLARGA;
    }

        public String [] DatosArray(){
        String [] lista = new String[13];
        lista[0]=String.valueOf(IDPRODUCTO);
        lista[1]=String.valueOf(EAN);
        lista[2]=DESCRIPCION;
        lista[3]=String.valueOf(PRECIOCOM);
        lista[4]=String.valueOf(PRECIOVEN);
        lista[5]=CATEGORIALARGA;
        lista[6]=UMELARGA;
        lista[7]=ESTADOLARGA;
        lista[8]=String.valueOf(FLGELI);
        lista[9]=Formatos.sdf.format(FCHCREA);
        lista[10]=USRCREA;
        lista[11]=Formatos.sdf.format(FCHMOD);
        lista[12]=USRMOD;
        return lista;
    } 

}
