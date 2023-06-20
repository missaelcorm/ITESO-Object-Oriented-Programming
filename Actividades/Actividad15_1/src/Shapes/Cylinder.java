/**
 * Cylinder
 */
package Shapes;

public class Cylinder extends Shape3D {

    private double radius = 1;
    private double height = 1;

    public Cylinder(int posX, int posY, int posZ){
        super(posX, posY, posZ);
    }

    public Cylinder(int posX, int posY, int posZ, double radius, double height){
        super(posX, posY, posZ);
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double radius){
        if(radius > 0 && radius < 100)
            this.radius = radius;
    }

    public void setHeight(double height){
        if(height > 0 && height < 100)
            this.height = height;
    }
}