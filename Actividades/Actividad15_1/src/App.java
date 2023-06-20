import Shapes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Shape3D[] shapes = new Shape3D[3];

        shapes[0] = Shape3D.getInstance(3, 4, 5, Shape3D.BOX, 30, 2, 23);
        shapes[1] = Shape3D.getInstance(3, 4, 5, Shape3D.CYLINDER, 23, 54);
        shapes[2] = Shape3D.getInstance(3, 4, 5, Shape3D.SPHERE, 12);
    }
}
