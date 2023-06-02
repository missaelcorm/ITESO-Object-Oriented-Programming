import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

/**
 * Actividad2
 */
public class Actividad2_1 {

    public static void main(String[] args) {
    //1.-
        float height = 1.80f;
        String button = "A";
        long memAdd = 0xf67389;
        short year = 2020;
        boolean bisiesto = year % 4 == 0 ? true : false;

        //type var = expresion ? valor true : valor false

        if (year % 4 == 0)
            bisiesto = true;
        else
            bisiesto = false;
        
        String RFC = "COMR030317J36";
        int poblacion = 7_886_889;
        float masaPlaneta = 786_778_687.6839f;
        byte edad = 20;

        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = new String("Hola");

        if(s1==s2)
            System.out.println("s1 == s2");
        if(s1==s3)
            System.out.println("s1 == s3");

        if(s1.equals(s2))
            System.out.println("s1 == s2");
        if(s1.equals(s3))
            System.out.println("s1 == s2");
    }
}