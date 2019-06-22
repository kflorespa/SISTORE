package Entidades;

/**
 *
 * @author kflores
 */
public class Sucursal {
int IDSUCURSAL;
int IDTIENDA;
String DESCRIPCION;
String DIRECCION;
Object FLGELI;

String TIENDA;
String FLEJE;

    public String getTIENDA() {
        return TIENDA;
    }

    public void setTIENDA(String TIENDA) {
        this.TIENDA = TIENDA;
    }

    public String getFLEJE() {
        return FLEJE;
    }

    public void setFLEJE(String FLEJE) {
        this.FLEJE = FLEJE;
    }

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
    
    public Object getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(Object FLGELI) {
        this.FLGELI = FLGELI;
    }

    public Sucursal(int IDSUCURSAL, int IDTIENDA, String TIENDA, String DESCRIPCION, String DIRECCION, Object FLGELI, String FLEJE) {
        this.IDSUCURSAL = IDSUCURSAL;
        this.IDTIENDA = IDTIENDA;
        this.DESCRIPCION = DESCRIPCION;
        this.DIRECCION = DIRECCION;
        this.FLGELI = FLGELI;
        this.TIENDA = TIENDA;
        this.FLEJE = FLEJE;
    }

 

    public Sucursal() {
    }
    
        public Object [] DatosArray(){
        Object [] lista = new Object[7];
        lista[0]=String.valueOf(IDSUCURSAL);
        lista[1]=String.valueOf(IDTIENDA);
        lista[2]=TIENDA;
        lista[3]=DESCRIPCION;
        lista[4]=DIRECCION;
        int ac = Integer.parseInt((String) FLGELI);
        if(ac == 1) lista[5] = false;
        else lista[5] = true;
        lista[6]=FLEJE;
        return lista;
    } 

    public Sucursal(String DESCRIPCIONLARGA) {
        this.DESCRIPCION = DESCRIPCIONLARGA;
    }
}
