package recursos;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author KFLORES
 */
public class dashtyped {
       /*EVENTO PARA DNI O NUMEROS DE 8 DIGITOS*/
    public void control_dni(KeyEvent evt,JTextField campo){
           try {         
        char c = evt.getKeyChar();
        if (campo.getText().length()>=8)evt.consume(); 
        if ((c<'0' || c>'9')) evt.consume(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /*EVENTO PARA NUMEROS CONTROLANDO CANTIDAD DE DIGITOS */
    public void control_maxdigitos_numeros(KeyEvent evt,JTextField campo,int numax){
           try {          
        char c = evt.getKeyChar();
        
        if (campo.getText().length()>=numax)evt.consume();
        if ((c<'0' || c>'9')) evt.consume(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        /*EVENTO PARA NUMEROS CONTROLANDO CANTIDAD DE DIGITOS */
    public void control_maxdigitos_decimales(KeyEvent evt,JTextField campo,int numax){
           try {          
        char c = evt.getKeyChar();
        
        if (campo.getText().length()>=numax)evt.consume();
        if ((c<'0' || c>'9') && c!='.') evt.consume();
               if (c=='.' && campo.getText().contains(".")) {
                   evt.consume();
               }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
       /*EVENTO PARA SOLO LETRAS Y ESPACIO */
    public void solo_letras_espacio(KeyEvent evt,JTextField campo,int cant){
           try {      
               
        char c = evt.getKeyChar();
         if (campo.getText().length()==cant){evt.consume();}
       
        if (!Character.isLetter(c)){
            if (!(c==KeyEvent.VK_SPACE)) {
                evt.consume();}
         }                     
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
       /*EVENTO PARA SOLO LETRAS */
        public void control_maxletras(KeyEvent evt,JTextField campo,int cant){
           try {          
        char c = evt.getKeyChar();
        if (campo.getText().length()==cant){evt.consume();}
        if (!Character.isLetter(c)){ 
            evt.consume();}                     
        } catch (Exception e) {
            System.out.println(e);
        }
    }

        /*CONTROLA TECLA PRESIONADA*/
        public void presiona_tecla(KeyEvent evt,JButton btn,int tecla){
                 if (evt.getKeyCode()==tecla) {
                   btn.doClick();
        }        
        }
        
        /*TODO CON TAMAÑO Y SIN ESPACIO*/
        public void control_maxdigitos(KeyEvent evt,JTextField campo,int cant){
           try {          
        campo.setText(campo.getText().trim());
        if (campo.getText().length()==cant){evt.consume();}
       
        } catch (Exception e) {
            System.out.println(e);
        }
            } 
//            /*CONTROLAR 0 Y 1 */
//        public void control_cero_uno(KeyEvent evt,JTextField campo){
//          try {          
//        char c = evt.getKeyChar();
//        
//        if (campo.getText().length()>=numax)evt.consume();
//        if ((c<'0' || c>'9')) evt.consume(); 
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//            } 
        
        
        
        
   
        
}
