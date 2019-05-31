package Entidades;

import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
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
String DESTADO;
String DCATEGORIA;
String DUME;
String FLEJE;

        public int getIDPRODUCTO(){
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

    public int getCODUME() {
        return CODUME;
    }

    public void setCODUME(int CODUME) {
        this.CODUME = CODUME;
    }

    public int getCODESTADO() {
        return CODESTADO;
    }

    public void setCODESTADO(int CODESTADO) {
        this.CODESTADO = CODESTADO;
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

    public String getFCHCREA() {
        return Formatos.sdflargo.format(FCHCREA);
    }

    public void setFCHCREA(String FCHCREA) throws ParseException{
        this.FCHCREA = Formatos.sdflargo.parse(FCHCREA);
    }

    public String getUSRCREA() {
        return USRCREA;
    }

    public void setUSRCREA(String USRCREA) {
        this.USRCREA = USRCREA;
    }

    public String getFCHMOD() {
        return Formatos.sdflargo.format(FCHMOD);
    }

    public void setFCHMOD(String FCHMOD) throws ParseException{
        this.FCHMOD = Formatos.sdflargo.parse(FCHMOD);
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

    public String getDESTADO() {
        return DESTADO;
    }

    public void setDESTADO(String DESTADO) {
        this.DESTADO = DESTADO;
    }

    public String getDCATEGORIA() {
        return DCATEGORIA;
    }

    public void setDCATEGORIA(String DCATEGORIA) {
        this.DCATEGORIA = DCATEGORIA;
    }

    public String getDUME() {
        return DUME;
    }

    public void setDUME(String DUME) {
        this.DUME = DUME;
    }

    public String getFLEJE() {
        return FLEJE;
    }


    public void setFLEJE(String FLEJE) {
        this.FLEJE = FLEJE;
    }

    public Producto() {
    } 

    public Producto(int IDPRODUCTO, String EAN, String DESCRIPCION, float PRECIOCOM, float PRECIOVEN, int IDCATEGORIA, String DCATEGORIA, int CODUME, String DUME, int CODESTADO, String DESTADO, char FLGELI, String FLEJE, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD) {
        this.IDPRODUCTO = IDPRODUCTO;
        this.IDCATEGORIA = IDCATEGORIA;
        this.CODUME = CODUME;
        this.CODESTADO = CODESTADO;
        this.EAN = EAN;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIOCOM = PRECIOCOM;
        this.PRECIOVEN = PRECIOVEN;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
        this.DESTADO = DESTADO;
        this.DCATEGORIA = DCATEGORIA;
        this.DUME = DUME;
        this.FLEJE = FLEJE;
    }
    

    public String[] DatosArray() {
        String [] lista = new String[17];
        lista[0]=String.valueOf(IDPRODUCTO);
        lista[1]=EAN;
        lista[2]=DESCRIPCION;
        lista[3]=String.valueOf(PRECIOCOM);
        lista[4]=String.valueOf(PRECIOVEN);
        lista[5]=String.valueOf(IDCATEGORIA);
        lista[6]=DCATEGORIA;
        lista[7]=String.valueOf(CODUME);
        lista[8]=DUME;
        lista[9]=String.valueOf(CODESTADO);
        lista[10]=DESTADO;
        lista[11]=String.valueOf(FLGELI);
        lista[12]=FLEJE;
        lista[13]=Formatos.sdflargo.format(FCHCREA);
        lista[14]=USRCREA;
        lista[15]=Formatos.sdflargo.format(FCHMOD);
        lista[16]=USRMOD;
        return lista;
    } 

}
