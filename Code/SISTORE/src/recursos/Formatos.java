/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author KFLORES
 */
public class Formatos {
    public static SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat  sdflargo = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static DecimalFormat df = new DecimalFormat("0.00",DecimalFormatSymbols.getInstance(Locale.US));
    
    public static java.sql.Date fechasql(String fecha) throws ParseException{
    java.util.Date f = Formatos.sdf.parse(fecha);
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTimeInMillis(f.getTime());
        java.sql.Date f2 = new java.sql.Date(gc.getTimeInMillis());
        return f2;
    }
}
