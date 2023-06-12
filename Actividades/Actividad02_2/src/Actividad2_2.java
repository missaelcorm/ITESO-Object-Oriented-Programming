/**
 * Actividad2_2
 */
import javax.swing.JOptionPane;

public class Actividad2_2 {

    public static void main(String[] args) {
        String distStr = JOptionPane.showInputDialog("Distancia (KM)");
        String timeIStr = JOptionPane.showInputDialog("Initial Time (m)");
        String timeFStr = JOptionPane.showInputDialog("Final Time (m)");

        double distDou = Double.parseDouble(distStr);
        int totalIMinutes = Integer.parseInt(timeIStr);
        double hoursI = totalIMinutes / 60;
        int minutesI = (int) totalIMinutes % 60;
        int totalFMinutes = Integer.parseInt(timeFStr) + totalIMinutes;
        double hoursF = totalFMinutes / 60;
        int minutesF = (int) totalFMinutes % 60;

        double velocity = distDou / (hoursF-hoursI);

        JOptionPane.showMessageDialog(null, "Velocidad Promedio: " + velocity + " km/h");
    }
}