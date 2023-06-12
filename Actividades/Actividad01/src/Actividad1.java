/**
 * Actividad1
 */
public class Actividad1 {

    public static void main(String[] args) {
    // 1.-
    /* 
        boolean registro1;  //Valid
        boolean 1registro;  // NotValid: Starts with a num
        boolean archivo_3;  //Valid
        boolean while;  //NotValid: Reserved Word
        boolean $impuesto;  //Valid
        boolean año;  //Valid
        boolean primer apellido;  //NotValid: Contains an espace
        boolean primer_apellido;  //Valid
        boolean primer-apellido;  //NotValid: Contains a dash
        boolean 1primerApellido;  //NotValid: Starts with a num
        boolean Tom’s;  //NotValid: Contains and invalid character
        boolean C3PO;  //Valid
    */

    // 2.-
        int N = 5;
        double A = 4.56;
        char C = 'a';

        System.out.println("N = " + N);
        System.out.println("A = " + A);
        System.out.println("C = " + C);
        System.out.println(N + " + " + A + " = " + /*(double)*/ (N+A));
        System.out.println(A + " - " + N + " = " + /*(double)*/ (A-N));
        System.out.println(N + " - " + A + " = " + /*(double)*/ (N-A));
        System.out.println("Valor numerico del caracter C = " + (int) C);

    // 3.-
        double a = 0.5;
        double b = .5;
        double c = 9.3e12;
        double d = 9.3e-12;
        int e = 12345678;
        //int f = 12345678_L;  //NotValid: Contains an underscore 
        //double g = 0.8E+0.8;  //NotValid: Contains a dot
        //double h = 0.8E 8; //NotValid: Contains a space
        int i = 05_15;
        //018CDF; //NotValid: ¿Hex, float or Octal?
        int j = 0XBC5DA;
        int k = 0x87e3a;
        long l = 234567L;
        //int m = 0_B11 //NotValid: Contains an underscore
        int n = 010101;
        int ñ = 0_557;
        //int o = .00.8E2; //NotValid: Contains two dots
        float p = .3e3f;
        int q = 0b111;
        long r = 12_234L;
    }
}