package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Perfilusuario {
int IDREGISTRO;
int IDUSUARIO;
int IDPERFIL;
int IDSUCURSAL;
String USRCREA;
Date FCHCREA;
String USRMOD;
Date FCHMOD;
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

    public int getIDPERFIL() {
        return IDPERFIL;
    }

    public void setIDPERFIL(int IDPERFIL) {
        this.IDPERFIL = IDPERFIL;
    }

    public int getIDSUCURSAL() {
        return IDSUCURSAL;
    }

    public void setIDSUCURSAL(int IDSUCURSAL) {
        this.IDSUCURSAL = IDSUCURSAL;
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
    public Perfilusuario(int IDREGISTRO, int IDUSUARIO, int IDPERFIL, int IDSUCURSAL, String USRCREA, Date FCHCREA, String USRMOD, Date FCHMOD, char FLGELI) {
        this.IDREGISTRO = IDREGISTRO;
        this.IDUSUARIO = IDUSUARIO;
        this.IDPERFIL = IDPERFIL;
        this.IDSUCURSAL = IDSUCURSAL;
        this.USRCREA = USRCREA;
        this.FCHCREA = FCHCREA;
        this.USRMOD = USRMOD;
        this.FCHMOD = FCHMOD;
        this.FLGELI = FLGELI;
    }

    public Perfilusuario() {
    }
    public String [] DatosArray(){
        String [] lista = new String[9];
        lista[0]=String.valueOf(IDREGISTRO);
        lista[1]=String.valueOf(IDUSUARIO);
        lista[2]=String.valueOf(IDPERFIL);
        lista[3]=String.valueOf(IDSUCURSAL);
        lista[4]=USRCREA;
        lista[5]=Formatos.sdf.format(FCHCREA);
        lista[6]=USRMOD;
        lista[7]=Formatos.sdf.format(FCHMOD);
        lista[8]=String.valueOf(FLGELI);
        return lista;
    }   
}
