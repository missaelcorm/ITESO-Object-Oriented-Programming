/**
 * Ejer3
 */
import javax.swing.JOptionPane;

public class Ejer3 {

    public static void main(String[] args) {
        String inputStr;
        double price;
        do {
            inputStr = JOptionPane.showInputDialog("Ingrese la clave");
            try {
                if (inputStr == null) break;
                if (inputStr.equals("")){
                    System.out.println("Ingreaste ENTER");
                    continue;
                }
                price = Double.parseDouble(inputStr);
                if (price>0){
                    System.out.printf("Precio + IVA: $%.2f\n", price+(price*.16));
                    break;
                }
                else if(price<=0){
                    System.out.println("Ingresaste precio negativo o igual a cero");
                }
            } catch (Exception e) {
                System.out.println("Ingresaste valor inválido");
                continue;

            }
        } while (true);
    }
}