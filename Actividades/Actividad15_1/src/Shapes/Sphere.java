/**
 * Sphere
 */
package Shapes;

public class Sphere extends Shape3D {

    private double radius = 1;

    public Sphere(int posX, int posY, int posZ){
        super(posX, posY, posZ);
    }

    public Sphere(int posX, int posY, int posZ, double radius){
        super(posX, posY, posZ);
        setRadius(radius);
    }

    public void setRadius(double radius){
        if(radius > 0 && radius < 100)
            this.radius = radius;
    }

    
}