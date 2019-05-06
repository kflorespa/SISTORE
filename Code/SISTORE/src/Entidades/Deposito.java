package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Deposito {
int IDDEPOSITO;
int IDPRODUCTO;
int IDALMACEN;
float CANTIDAD;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
Date FCHVEN;
Date FCHRET;

    public int getIDDEPOSITO() {
        return IDDEPOSITO;
    }

    public void setIDDEPOSITO(int IDDEPOSITO) {
        this.IDDEPOSITO = IDDEPOSITO;
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public int getIDALMACEN() {
        return IDALMACEN;
    }

    public void setIDALMACEN(int IDALMACEN) {
        this.IDALMACEN = IDALMACEN;
    }

    public float getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(float CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
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

    public String getFCHVEN() {
        return Formatos.sdf.format(FCHVEN);
    }

    public void setFCHVEN(String FCHVEN) throws ParseException{
        this.FCHVEN = Formatos.sdf.parse(FCHVEN);
    }

    public String getFCHRET() {
        return Formatos.sdf.format(FCHRET);
    }

    public void setFCHRET(String FCHRET) throws ParseException{
        this.FCHRET = Formatos.sdf.parse(FCHRET);
    }

    public Deposito(int IDDEPOSITO, int IDPRODUCTO, int IDALMACEN, float CANTIDAD, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, Date FCHVEN, Date FCHRET) {
        this.IDDEPOSITO = IDDEPOSITO;
        this.IDPRODUCTO = IDPRODUCTO;
        this.IDALMACEN = IDALMACEN;
        this.CANTIDAD = CANTIDAD;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FCHVEN = FCHVEN;
        this.FCHRET = FCHRET;
    }

    public Deposito() {
    }

        public String [] DatosArray(){
        String [] lista = new String[10];
        lista[0]=String.valueOf(IDDEPOSITO);
        lista[1]=String.valueOf(IDPRODUCTO);
        lista[2]=String.valueOf(IDALMACEN);
        lista[3]=String.valueOf(CANTIDAD);
        lista[4]=Formatos.sdf.format(FCHCREA);
        lista[5]=USRCREA;
        lista[6]=Formatos.sdf.format(FCHMOD);
        lista[7]=USRMOD;
        lista[8]=Formatos.sdf.format(FCHVEN);
        lista[9]=Formatos.sdf.format(FCHRET);
        return lista;
    } 
}
