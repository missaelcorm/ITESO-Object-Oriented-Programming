import iteso.libs.shapes2D.Rectangle;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //3_1
        Rectangle rec1 = new Rectangle(20, 30);
        Rectangle rec2 = new Rectangle(30, 40);
        Rectangle rec3 = new Rectangle(40, 50);

        rec2 = rec1;
        System.gc();

        JOptionPane.showConfirmDialog(null, null, null, 0);
        rec2 = null;
        System.gc();

        //3_2
        int N = 1000;
        int J = 10;
        for(int i=0; i<N*J; i++){
            double[] M = new double[1_000_000*J];
            M[0] = 78.5;
        }
    }
}
