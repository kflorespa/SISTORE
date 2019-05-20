package Entidades;
/**
 *
 * @author kflores
 */
public class Almacen {
    int IDALMACEN;
    int IDSUCURSAL;
    String DESCRIPCION;
    char FLGELI;

    public Almacen() {
    }

    public Almacen(int IDALMACEN, int IDSUCURSAL, String DESCRIPCION, char FLGELI) {
        this.IDALMACEN = IDALMACEN;
        this.IDSUCURSAL = IDSUCURSAL;
        this.DESCRIPCION = DESCRIPCION;
        this.FLGELI = FLGELI;
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

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }

        public String [] DatosArray(){
        String [] lista = new String[4];
        lista[0]=String.valueOf(IDALMACEN);
        lista[1]=String.valueOf(IDSUCURSAL);
        lista[2]=DESCRIPCION;
        lista[3]=String.valueOf(FLGELI);
        return lista;
    }
}
