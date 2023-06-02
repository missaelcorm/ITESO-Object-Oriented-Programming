import java.util.Random;

/**
 * Ejer2
 */
public class Ejer2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int R;
        short x = (short) rand.nextInt(100);

        do {
            R = rand.nextInt(20);
        } while (R < 2);

        short[] V = new short[R];
        int countGreaterX = 0, countOdd = 0;

        for (int i = 0; i < R; i++)
            V[i] = (short) rand.nextInt(100);

        for (short s : V) {
            if (s > x)
                countGreaterX++;
            if (s % 2 != 0)
                countOdd++;
        }

        short[] V1 = new short[countGreaterX];
        short[] V2 = new short[countOdd];

        int i = 0, j = 0;
        for (short s : V) {
            if (s > x) {
                V1[i] = s;
                i++;
            }
            if (s % 2 != 0) {
                V2[j] = s;
                j++;
            }
        }

        System.out.printf("X  =\t%2d\n", x);
        System.out.printf("V  =\t");
        for (short s : V) {
            System.out.printf("%2d  ", s);
        }

        System.out.printf("\nV1 =\t");
        for (short s : V1) {
            System.out.printf("%2d  ", s);
        }

        System.out.printf("\nV2 =\t");
        for (short s : V2) {
            System.out.printf("%2d  ", s);
        }
    }
}