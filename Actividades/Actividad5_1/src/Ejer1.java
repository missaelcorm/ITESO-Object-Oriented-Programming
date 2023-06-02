/**
 * Ejer1
 */
public class Ejer1 {

    public static void printMatrix(Integer[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer A[][] = { { 1, 2 },
                { 4, 5, 6 },
                { 7 } };
        Integer B[][] = { { 9, 8, 7, 8 },
                { 6, 5 },
                { 3, 2 } };

        Integer C[][] = A.length > B.length ? new Integer[A.length][] : new Integer[B.length][];

        for (int i = 0; i < C.length; i++) {
            int elements = A[i].length > B[i].length ? A[i].length : B[i].length;
            C[i] = new Integer[elements];
            for (int j = 0; j < elements; j++) {
                int Av = 0, Bv = 0;
                try {
                    Av = A[i][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    Av = 0;
                }
                try {
                    Bv = B[i][j];
                } catch (ArrayIndexOutOfBoundsException e) {
                    Bv = 0;
                }
                C[i][j] = Av + Bv;
            }
        }

        System.out.println("A =");
        printMatrix(A);

        System.out.println("B =");
        printMatrix(B);

        System.out.println("A + B =");
        printMatrix(C);

    }
}