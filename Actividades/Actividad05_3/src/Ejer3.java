import java.util.Random;

/**
 * Ejer3
 */
public class Ejer3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int R;
        do {
            R = rand.nextInt(21);
        } while (R < 2);

        for (int i = 1; i <= R; i++) {
            for (int j = 0; j < i; j++)
                System.out.printf("%2d  ", i);
            System.out.println();
        }

    }
}