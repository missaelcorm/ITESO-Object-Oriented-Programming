/**
 * StringsCompare
 */
import javax.swing.JOptionPane;

public class StringsCompare {

    public static void main(String[] args) {
        String s1, s2;
        String s3 = "Hola", s4 = "Hola";

        s1 = JOptionPane.showInputDialog("Dame un nombre:");
        s2 = JOptionPane.showInputDialog("Dame otro nombre:");

        if(s1==s2){
            System.out.println("s1 y s2 apuntan a la misma direcion");
        }

        System.out.println("s1: "+System.identityHashCode(s1));
        System.out.println("s2: "+System.identityHashCode(s2));
        System.out.println("s3: "+System.identityHashCode(s3));
        System.out.println("s4: "+System.identityHashCode(s4));

        if(s1.equals(s2)){
            System.out.println("s1 y s2 son iguales");
        }
    }
}