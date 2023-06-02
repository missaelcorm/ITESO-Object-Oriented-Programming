/**
 * SumTwoNumbers
 */
import javax.swing.JOptionPane;

public class SumTwoNumbers {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("First Number:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Second Number:"));
        
        JOptionPane.showMessageDialog(null, "El resultado es: "+(n1+n2));
    }
}