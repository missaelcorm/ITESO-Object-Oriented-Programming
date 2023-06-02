/**
 * Actividad2_3
 */

import javax.swing.JOptionPane;

public class Actividad2_3 {

    public static void main(String[] args) {
        String names = JOptionPane.showInputDialog("Ingrese su nombre(s)");
        String lastName = JOptionPane.showInputDialog("Ingrese su Apellido Paterno)");
        String secondLastName = JOptionPane.showInputDialog("Ingrese su Apellido Materno");

        JOptionPane.showMessageDialog(null, names + " " + lastName + " " + secondLastName);
    }
}