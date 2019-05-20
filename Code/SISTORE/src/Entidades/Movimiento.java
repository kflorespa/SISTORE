package Entidades;

import java.text.ParseException;
import java.util.Date;
import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Movimiento {
int IDMOVIMIENTO;
int IDPROVEEDOR;
int IDALMACEN;
int IDSUCURSAL;
int CODOPERACION;
float MONTOTOTAL;
Date FCHMOV;
Date FCHCREA;
String USRCREA;
Date FCHMOD;
String USRMOD;
char FLGELI;
char CODESTADO;

    public int getIDMOVIMIENTO() {
        return IDMOVIMIENTO;
    }

    public void setIDMOVIMIENTO(int IDMOVIMIENTO) {
        this.IDMOVIMIENTO = IDMOVIMIENTO;
    }

    public int getIDPROVEEDOR() {
        return IDPROVEEDOR;
    }

    public void setIDPROVEEDOR(int IDPROVEEDOR) {
        this.IDPROVEEDOR = IDPROVEEDOR;
    }

    public int getIDALMACEN() {
        return IDALMACEN;
    }

    public void setIDALMACEN(int IDALMACEN) {
        this.IDALMACEN = IDALMACEN;
    }

    public int getIDSUCURSAL() {
        return IDSUCURSAL;
    }

    public void setIDSUCURSAL(int IDSUCURSAL) {
        this.IDSUCURSAL = IDSUCURSAL;
    }

    public int getCODOPERACION() {
        return CODOPERACION;
    }

    public void setCODOPERACION(int CODOPERACION) {
        this.CODOPERACION = CODOPERACION;
    }

    public float getMONTOTOTAL() {
        return MONTOTOTAL;
    }

    public void setMONTOTOTAL(float MONTOTOTAL) {
        this.MONTOTOTAL = MONTOTOTAL;
    }

    public String getFCHMOV() {
        return Formatos.sdf.format(FCHMOV);
    }

    public void setFCHMOV(String FCHMOV) throws ParseException{
        this.FCHMOV = Formatos.sdf.parse(FCHMOV);
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

    public char getCODESTADO() {
        return CODESTADO;
    }

    public void setCODESTADO(char CODESTADO) {
        this.CODESTADO = CODESTADO;
    }

    public Movimiento(int IDMOVIMIENTO, int IDPROVEEDOR, int IDALMACEN, int IDSUCURSAL, int CODOPERACION, float MONTOTOTAL, Date FCHMOV, Date FCHCREA, String USRCREA, Date FCHMOD, String USRMOD, char FLGELI, char CODESTADO) {
        this.IDMOVIMIENTO = IDMOVIMIENTO;
        this.IDPROVEEDOR = IDPROVEEDOR;
        this.IDALMACEN = IDALMACEN;
        this.IDSUCURSAL = IDSUCURSAL;
        this.CODOPERACION = CODOPERACION;
        this.MONTOTOTAL = MONTOTOTAL;
        this.FCHMOV = FCHMOV;
        this.FCHCREA = FCHCREA;
        this.USRCREA = USRCREA;
        this.FCHMOD = FCHMOD;
        this.USRMOD = USRMOD;
        this.FLGELI = FLGELI;
        this.CODESTADO = CODESTADO;
    }

    public Movimiento() {
    }

        public String [] DatosArray(){
        String [] lista = new String[9];
        lista[0]=String.valueOf(IDMOVIMIENTO);
        lista[1]=String.valueOf(IDPROVEEDOR);
        lista[2]=String.valueOf(IDALMACEN);
        lista[3]=String.valueOf(CODOPERACION);
        lista[4]=String.valueOf(MONTOTOTAL);
        lista[5]=Formatos.sdf.format(FCHMOV);
        lista[6]=USRCREA;
        lista[7]=String.valueOf(FLGELI);
        lista[8]=String.valueOf(CODESTADO);
        return lista;
    } 
}
