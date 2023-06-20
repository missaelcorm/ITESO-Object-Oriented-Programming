/**
 * Shape3D
 */
package Shapes;

public abstract class Shape3D {

    protected int posX;
    protected int posY;
    protected int posZ;

    public final static int SPHERE = 0;
    public final static int CYLINDER = 1;
    public final static int BOX = 2;

    public Shape3D(int posX, int posY, int posZ){
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public static Shape3D getInstance(int posX, int posY, int posZ, int type){
        if(type == SPHERE)
            return new Sphere(posX, posY, posZ);
        if(type == CYLINDER)
            return new Cylinder(posX, posY, posZ);
        if(type == BOX)
            return new Box(posX, posY, posZ);

        return null;
    }

    public static Shape3D getInstance(int posX, int posY, int posZ, int type, double radius){
        if(type == SPHERE)
            return new Sphere(posX, posY, posZ, radius);

        return null;
    }

    public static Shape3D getInstance(int posX, int posY, int posZ, int type, double radius, double height){
        if(type == CYLINDER)
            return new Cylinder(posX, posY, posZ, radius, height);

        return null;
    }

    public static Shape3D getInstance(int posX, int posY, int posZ, int type, double height, double length, double width){
        if(type == SPHERE)
            return new Box(posX, posY, posZ, height, length, width);

        return null;
    }

}