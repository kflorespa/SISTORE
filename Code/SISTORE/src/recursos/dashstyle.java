package recursos;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author KFLORES
 */
public class dashstyle {
    public void estilo_nimbus(){
         try{
  UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
} }

public void estilo_windows(){
         try{
  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
}catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
} }

public Image icon(String ruta){
Image icon= Toolkit.getDefaultToolkit().getImage(getClass().getResource(ruta));
return icon;
/*setIconImage(icon);*/
}


}
