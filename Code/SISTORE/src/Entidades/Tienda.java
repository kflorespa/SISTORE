package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Tienda {
int IDTIENDA;
String NOMBRE;
String DIRECCION;
String DEPARTAMENTO;
String PROVINCIA;
String DISTRITO;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;    

    public int getIDTIENDA() {
        return IDTIENDA;
    }

    public void setIDTIENDA(int IDTIENDA) {
        this.IDTIENDA = IDTIENDA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    public void setDEPARTAMENTO(String DEPARTAMENTO) {
        this.DEPARTAMENTO = DEPARTAMENTO;
    }

    public String getPROVINCIA() {
        return PROVINCIA;
    }

    public void setPROVINCIA(String PROVINCIA) {
        this.PROVINCIA = PROVINCIA;
    }

    public String getDISTRITO() {
        return DISTRITO;
    }

    public void setDISTRITO(String DISTRITO) {
        this.DISTRITO = DISTRITO;
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

    public Tienda(int IDTIENDA, String NOMBRE, String DIRECCION, String DEPARTAMENTO, String PROVINCIA, String DISTRITO, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI) {
        this.IDTIENDA = IDTIENDA;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.DEPARTAMENTO = DEPARTAMENTO;
        this.PROVINCIA = PROVINCIA;
        this.DISTRITO = DISTRITO;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
    }

    public Tienda() {
    }

        public String [] DatosArray(){
        String [] lista = new String[11];
        lista[0]=String.valueOf(IDTIENDA);
        lista[1]=NOMBRE;
        lista[2]=DIRECCION;
        lista[3]=DEPARTAMENTO;
        lista[4]=PROVINCIA;
        lista[5]=DISTRITO;
        lista[6]=Formatos.sdf.format(FCHCREA);
        lista[7]=USRCREA;
        lista[8]=Formatos.sdf.format(FCHMOD);
        lista[9]=USRMOD;
        lista[10]=String.valueOf(FLGELI);
        return lista;
    } 

}
