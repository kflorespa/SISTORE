package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Movimientodetalle {
int IDMOVIMIENTODETALLE;
int IDMOVIMIENTO;
int IDPRODUCTO;
float CANTIDAD;
Date FECHVEN;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

    public int getIDMOVIMIENTODETALLE() {
        return IDMOVIMIENTODETALLE;
    }

    public void setIDMOVIMIENTODETALLE(int IDMOVIMIENTODETALLE) {
        this.IDMOVIMIENTODETALLE = IDMOVIMIENTODETALLE;
    }

    public int getIDMOVIMIENTO() {
        return IDMOVIMIENTO;
    }

    public void setIDMOVIMIENTO(int IDMOVIMIENTO) {
        this.IDMOVIMIENTO = IDMOVIMIENTO;
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public float getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(float CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public String getFECHVEN() {
        return Formatos.sdf.format(FECHVEN);
    }

    public void setFECHVEN(String FECHVEN) throws ParseException{
        this.FECHVEN = Formatos.sdf.parse(FECHVEN);
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

    public Movimientodetalle(int IDMOVIMIENTODETALLE, int IDMOVIMIENTO, int IDPRODUCTO, float CANTIDAD, Date FECHVEN, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDMOVIMIENTODETALLE = IDMOVIMIENTODETALLE;
        this.IDMOVIMIENTO = IDMOVIMIENTO;
        this.IDPRODUCTO = IDPRODUCTO;
        this.CANTIDAD = CANTIDAD;
        this.FECHVEN = FECHVEN;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
    }

    public Movimientodetalle() {
    }
        public String [] DatosArray(){
        String [] lista = new String[10];
        lista[0]=String.valueOf(IDMOVIMIENTODETALLE);
        lista[1]=String.valueOf(IDMOVIMIENTO);
        lista[2]=String.valueOf(IDPRODUCTO);
        lista[3]=String.valueOf(CANTIDAD);
        lista[4]=Formatos.sdf.format(FECHVEN);
        lista[5]=Formatos.sdf.format(FCHCREA);
        lista[6]=USRCREA;
        lista[7]=Formatos.sdf.format(FCHMOD);
        lista[8]=USRMOD;
        lista[9]=String.valueOf(FLGELI);
        return lista;
    
}
}
