/**
 * Ejer2
 */
import javax.swing.JOptionPane;
public class Ejer2 {

    public static void main(String[] args) {
        int presicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la precision"));
        double multplyBy = 0;
        double j=1;

        for(int i=0; i<presicion; i++, j+=2)
            multplyBy = i%2==0 ? multplyBy+1/j : multplyBy-1/j;

        double result = 4*multplyBy;

        JOptionPane.showMessageDialog(null, "PI = " + result);
    }
}