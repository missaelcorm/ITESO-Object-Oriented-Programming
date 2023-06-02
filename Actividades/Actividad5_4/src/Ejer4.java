/**
 * Ejer4
 */
import javax.swing.JOptionPane;

public class Ejer4 {

    public static void main(String[] args) {
        int nCals = Integer.parseInt(JOptionPane.showInputDialog("Calificaciones a ingresar"));

        float[] cals = new float[nCals];

        for(int i=0; i<nCals; i++)
            cals[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion " + (i+1)));

        float mediana = cals.length % 2 == 0 ? (cals[(cals.length/2)-1] + cals[cals.length/2])/2 : cals[(int)cals.length/2];

        JOptionPane.showMessageDialog(null, "Mediana = " + mediana);

    }
}