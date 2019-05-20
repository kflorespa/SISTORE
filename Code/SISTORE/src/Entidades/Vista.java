package Entidades;

/**
 *
 * @author kflores
 */
public class Vista {
int IDVISTA;
String MODULO;
String DESCRIPCION;
char FLGELI;

    public int getIDVISTA() {
        return IDVISTA;
    }

    public void setIDVISTA(int IDVISTA) {
        this.IDVISTA = IDVISTA;
    }

    public String getMODULO() {
        return MODULO;
    }

    public void setMODULO(String MODULO) {
        this.MODULO = MODULO;
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

    public Vista(int IDVISTA, String MODULO, String DESCRIPCION, char FLGELI) {
        this.IDVISTA = IDVISTA;
        this.MODULO = MODULO;
        this.DESCRIPCION = DESCRIPCION;
        this.FLGELI = FLGELI;
    }

    public Vista() {
    }

        public String [] DatosArray(){
        String [] lista = new String[4];
        lista[0]=String.valueOf(IDVISTA);
        lista[1]=MODULO;
        lista[2]=DESCRIPCION;
        lista[3]=String.valueOf(FLGELI);
        return lista;
    }   

}
