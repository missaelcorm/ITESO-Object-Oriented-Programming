
/**
 * Ejer1
 */
import javax.swing.JOptionPane;

public class Ejer1 {

    public static void main(String[] args) {
        String key = "63FGRM";

        String inputStr;
        int tries = 1;

        do {
            inputStr = JOptionPane.showInputDialog("Ingrese la clave");
            try {
                if (key.equals(inputStr))
                    System.out.println("Acertaste en " + tries + " intentos.");
                else if (inputStr.equals(""))
                    continue;
                else {
                    System.out.println("Clave incorrecta");
                    tries++;
                }
            } catch (Exception e) {
                System.out.println(inputStr);
                break;
            }
        } while (!key.equals(inputStr));
    }
}
