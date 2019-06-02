package Entidades;

/**
 *
 * @author kflores
 */
public class Categoria {
int IDCATEGORIA;
String DESCRIPCION;
int DIARETIRO;
char FLGELI;

/*VARIABLE DE AUXILIAR*/
String FLEJE;

    public Categoria(int IDCATEGORIA, String DESCRIPCION, int DIARETIRO, String FLEJE, char FLGELI) {
        this.IDCATEGORIA = IDCATEGORIA;
        this.DESCRIPCION = DESCRIPCION;
        this.DIARETIRO = DIARETIRO;
        this.FLGELI = FLGELI;
        this.FLEJE = FLEJE;
    }

    public String getFLEJE() {
        return FLEJE;
    }

    public void setFLEJE(String FLEJE) {
        this.FLEJE = FLEJE;
    }

    public int getIDCATEGORIA() {
        return IDCATEGORIA;
    }

    public void setIDCATEGORIA(int IDCATEGORIA) {
        this.IDCATEGORIA = IDCATEGORIA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getDIARETIRO() {
        return DIARETIRO;
    }

    public void setDIARETIRO(int DIARETIRO) {
        this.DIARETIRO = DIARETIRO;
    }

    public char getFLGELI() {
        return FLGELI;
    }

    public void setFLGELI(char FLGELI) {
        this.FLGELI = FLGELI;
    }

    public Categoria(int IDCATEGORIA, int DIARETIRO, String DESCRIPCION, char FLGELI) {
        this.IDCATEGORIA = IDCATEGORIA;
        this.DESCRIPCION = DESCRIPCION;
        this.DIARETIRO = DIARETIRO;
        this.FLGELI = FLGELI;
    }

    
    public Categoria() {
    }
        public String [] DatosArray(){
        String [] lista = new String[4];
        lista[0]=String.valueOf(IDCATEGORIA);
        lista[1]=String.valueOf(DIARETIRO);
        lista[2]=DESCRIPCION;
        lista[3]=String.valueOf(FLGELI);
        return lista;
    }
        
       public String [] Lista(){
        String [] lista = new String[5];
        lista[0]=String.valueOf(IDCATEGORIA);
        lista[1]=DESCRIPCION;
        lista[2]=String.valueOf(DIARETIRO); 
        lista[3]=FLEJE;
        lista[4]=String.valueOf(FLGELI);
        return lista;
    }
        
}
