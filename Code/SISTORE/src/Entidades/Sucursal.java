package Entidades;

import recursos.Formatos;

/**
 *
 * @author kflores
 */
public class Sucursal {
int IDSUCURSAL;
int IDTIENDA;
String DESCRIPCION;
String DIRECCION;
char FLGELI;

    public int getIDSUCURSAL() {
        return IDSUCURSAL;
    }

    public void setIDSUCURSAL(int IDSUCURSAL) {
        this.IDSUCURSAL = IDSUCURSAL;
    }

    public int getIDTIENDA() {
        return IDTIENDA;
    }

    public void setIDTIENDA(int IDTIENDA) {
        this.IDTIENDA = IDTIENDA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }
    
    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }

    public Sucursal(int IDSUCURSAL, int IDTIENDA, String DESCRIPCION, String DIRECCION, char FLGELI) {
        this.IDSUCURSAL = IDSUCURSAL;
        this.IDTIENDA = IDTIENDA;
        this.DESCRIPCION = DESCRIPCION;
        this.DIRECCION = DIRECCION;
        this.FLGELI = FLGELI;
    }


    public Sucursal() {
    }
    
        public String [] DatosArray(){
        String [] lista = new String[5];
        lista[0]=String.valueOf(IDSUCURSAL);
        lista[1]=String.valueOf(IDTIENDA);
        lista[2]=DESCRIPCION;
        lista[3]=DIRECCION;
        lista[4]=String.valueOf(FLGELI);
        return lista;
    } 

    public Sucursal(String DESCRIPCIONLARGA) {
        this.DESCRIPCION = DESCRIPCIONLARGA;
    }
}
