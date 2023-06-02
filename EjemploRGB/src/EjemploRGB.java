/**
 * EjemploRGB
 */
import javax.swing.JOptionPane;
public class EjemploRGB {

    public static double findMax(double num1, double num2, double num3) {
        double max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }

    public static void main(String[] args) {
        int color = Integer.parseInt(JOptionPane.showInputDialog("Dame el color en hexadecimal"),16);

        int R = (color & 0xFF0000)>>16;
        int G = (color & 0x00FF00)>>8;
        int B = (color & 0x0000FF)>>0;

        double R_ = (double) R/255;
        double G_ = (double) G/255;
        double B_ = (double) B/255;

        double K = 1-findMax(R_, G_, B_);
        double C = (1-R_-K)/(1-K);
        double M = (1-G_-K)/(1-K);
        double Y = (1-B_-K)/(1-K);

        String CMYK_STR = String.format("C: %.2f\nM: %.2f\nY: %.2f\nK: %.2f", C, M, Y, K);
        JOptionPane.showMessageDialog(null, "red: "+R+"green: "+G+"blue: "+B);
        JOptionPane.showMessageDialog(null, CMYK_STR);
    }
}
