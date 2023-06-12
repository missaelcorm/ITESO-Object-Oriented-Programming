/**
 * TestCircle
 */
import Classes.Circle;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadio(2.5);
        circle2.setRadio(6.6);
        circle3.setRadio(7.5);
        
        circle1.print();
        circle2.print();
        circle3.print();
    }
}
