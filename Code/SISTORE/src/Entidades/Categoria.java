package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Categoria {
int IDCATEGORIA;
String DESCRIPCION;
int DIARETIRO;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;

    public int getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(int IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getDIARETIRO() {
        return DIARETIRO;
    }

    public void setDIARETIRO(int DIARETIRO) {
        this.DIARETIRO = DIARETIRO;
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


    public Categoria(int IDCATEGORIA, String DESCRIPCION, int DIARETIRO, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD) {
        this.IDCATEGORIA = IDCATEGORIA;
        this.DESCRIPCION = DESCRIPCION;
        this.DIARETIRO = DIARETIRO;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
    }

    public Categoria() {
    }

        public String [] DatosArray(){
        String [] lista = new String[7];
        lista[0]=String.valueOf(IDCATEGORIA);
        lista[1]=String.valueOf(DESCRIPCION);
        lista[2]=String.valueOf(DIARETIRO);
        lista[3]=Formatos.sdf.format(FCHCREA);
        lista[4]=USRCREA;
        lista[5]=Formatos.sdf.format(FCHMOD);
        lista[6]=USRMOD;
        return lista;
    } 
}
