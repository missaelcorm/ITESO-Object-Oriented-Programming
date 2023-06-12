import lib.RGBLib.RGBColor.RGBColor;

public class App {
    public static void main(String[] args) throws Exception {
        
        RGBColor one = new RGBColor();
        RGBColor two = new RGBColor(150, 250, 190);
        RGBColor three = two.clone();

        one.setRed(80);
        one.setGreen(30);
        one.setBlue(90);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        if(two.equals(three)){
            System.out.println("two and three are equals");
        }
    }
}
