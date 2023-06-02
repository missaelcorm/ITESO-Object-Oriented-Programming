/**
 * Circle
 */
package Classes;
import java.lang.Math;

public class Circle {

    private double radio;

    public void setRadio(double radio){
        this.radio = (radio>0) ? radio : null;
    }
    public double getArea (){
        return Math.PI*Math.pow(this.radio, 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radio;
    }

    public void print(){
        System.out.printf("Area       = %9.4f u²\nPerimeter  = %9.4f u\n", this.getArea(), this.getPerimeter());
    }
}