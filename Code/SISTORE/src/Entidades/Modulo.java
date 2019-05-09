package Entidades;

/**
 *
 * @author kflores
 */
public class Modulo {
int IDMODULO;
String DESCRIPCION;
char FLGELI;

    public int getIDMODULO() {
        return IDMODULO;
    }

    public void setIDMODULO(int IDMODULO) {
        this.IDMODULO = IDMODULO;
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

    public Modulo(int IDMODULO, String DESCRIPCION, char FLGELI) {
        this.IDMODULO = IDMODULO;
        this.DESCRIPCION = DESCRIPCION;
        this.FLGELI = FLGELI;
    }

    public Modulo() {
    }

       public String [] DatosArray(){
        String [] lista = new String[3];
        lista[0]=String.valueOf(IDMODULO);
        lista[1]=DESCRIPCION;
        lista[2]=String.valueOf(FLGELI);
        return lista;
    } 
}
