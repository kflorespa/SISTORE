package Entidades;
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
char FLGELI;

String FLEJE;

    public String getFLEJE() {
        return FLEJE;
    }

    public void setFLEJE(String FLEJE) {
        this.FLEJE = FLEJE;
    }

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
    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }

    public Tienda(int IDTIENDA, String NOMBRE, String DIRECCION, String DEPARTAMENTO, String PROVINCIA, String DISTRITO, char FLGELI, String FLEJE) {
        this.IDTIENDA = IDTIENDA;
        this.NOMBRE = NOMBRE;
        this.DIRECCION = DIRECCION;
        this.DEPARTAMENTO = DEPARTAMENTO;
        this.PROVINCIA = PROVINCIA;
        this.DISTRITO = DISTRITO;
        this.FLGELI = FLGELI;
        this.FLEJE = FLEJE;
    }



    public Tienda() {
    }

        public String [] DatosArray(){
        String [] lista = new String[7];
        lista[0]=String.valueOf(IDTIENDA);
        lista[1]=NOMBRE;
        lista[2]=DIRECCION;
        lista[3]=DEPARTAMENTO;
        lista[4]=PROVINCIA;
        lista[5]=DISTRITO;
        lista[6]=String.valueOf(FLGELI);
        lista[6]=FLEJE;
        return lista;
    } 

}
