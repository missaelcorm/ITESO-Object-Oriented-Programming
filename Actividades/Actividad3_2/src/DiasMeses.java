/**
 * DiasMeses
 */
import javax.swing.JOptionPane;

public class DiasMeses {

    public static void main(String[] args) {
        String month = JOptionPane.showInputDialog("Ingresa el mes").toUpperCase().trim();
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año"));
        int dias = 0;

        switch(month){
            case "ENERO":
            case "MARZO": 
            case "MAYO": 
            case "JULIO": 
            case "AGOSTO": 
            case "OCTUBRE": 
            case "DICIEMBRE": dias = 31; break;
            case "FEBRERO": dias = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28; break;
            case "ABRIL": 
            case "JUNIO": 
            case "SEPTIEMBRE": 
            case "NOVIEMBRE": dias = 30; break;
        }

        JOptionPane.showMessageDialog(null, month + " tiene: " + dias + " dias");
    }
}