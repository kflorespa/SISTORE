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
char CODUME;
String EAN;
String DESCRIPCION;
float PRECIO;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

    public Producto() {
    }

    public Producto(int IDPRODUCTO, int IDCATEGORIA, char CODUME, String EAN, String DESCRIPCION, float PRECIO, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDPRODUCTO = IDPRODUCTO;
        this.IDCATEGORIA = IDCATEGORIA;
        this.CODUME = CODUME;
        this.EAN = EAN;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIO = PRECIO;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
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

    public char getCODUME() {
        return CODUME;
    }

    public void setCODUME(char CODUME) {
        this.CODUME = CODUME;
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

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
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
        String [] lista = new String[11];
        lista[0]=String.valueOf(IDPRODUCTO);
        lista[1]=String.valueOf(IDCATEGORIA);
        lista[2]=String.valueOf(CODUME);
        lista[3]=String.valueOf(EAN);
        lista[4]=DESCRIPCION;
        lista[5]=String.valueOf(PRECIO);
        lista[6]=Formatos.sdf.format(FCHCREA);
        lista[7]=USRCREA;
        lista[8]=Formatos.sdf.format(FCHMOD);
        lista[9]=USRMOD;
        lista[10]=String.valueOf(FLGELI);
        return lista;
    } 

}
