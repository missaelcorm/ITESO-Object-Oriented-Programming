/**
 * HolaMundo
 */
public class HolaMundo {
    /**
     * Este es el metodo donde inicia la ejecucion
     * del programa
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int i = 200;

        System.out.printf("i = %d\n", i);
        System.out.println("i = " + i);

        int a = 123_456_789;
        System.out.printf("a = %d\n", a);

        float f1 = 1.5f;
        float f2 = (float) 1.5;
        String s1 = "f1 vale %.2f y f2 vale %.2f\n";
        System.out.printf(s1, f1, f2);
        System.out.printf("El string s1 tiene %d caracteres\n", s1.length());
    }
}