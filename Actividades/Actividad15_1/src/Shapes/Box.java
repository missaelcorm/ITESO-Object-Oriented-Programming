/**
 * Box
 */
package Shapes;

public class Box extends Shape3D {

    private double height = 1;
    private double length = 1;
    private double width = 1;

    public Box(int posX, int posY, int posZ){
        super(posX, posY, posZ);
    }

    public Box(int posX, int posY, int posZ, double height, double length, double width){
        super(posX, posY, posZ);
        setHeight(height);
        setLength(length);
        setWidth(width);
    }

    public void setHeight(double height){
        if(height > 0 && height < 100)
            this.height = height;
    }

    public void setLength(double length){
        if(length > 0 && length < 100)
            this.length = length;
    }

    public void setWidth(double width){
        if(width > 0 && width < 100)
            this.width = width;
    }
}