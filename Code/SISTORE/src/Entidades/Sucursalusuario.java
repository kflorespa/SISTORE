package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Sucursalusuario {
int IDREGISTRO;
int IDUSUARIO;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;

    public int getIDREGISTRO() {
        return IDREGISTRO;
    }

    public void setIDREGISTRO(int IDREGISTRO) {
        this.IDREGISTRO = IDREGISTRO;
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

    public Sucursalusuario(int IDREGISTRO, int IDUSUARIO, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDREGISTRO = IDREGISTRO;
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
        String [] lista = new String[7];
        lista[0]=String.valueOf(IDREGISTRO);
        lista[1]=String.valueOf(IDUSUARIO);
        lista[2]=Formatos.sdf.format(FCHCREA);
        lista[3]=USRCREA;
        lista[4]=Formatos.sdf.format(FCHMOD);
        lista[5]=USRMOD;
        lista[6]=String.valueOf(FLGELI);
        return lista;
    }   
}
