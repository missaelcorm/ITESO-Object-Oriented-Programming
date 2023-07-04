import java.util.ArrayList;

public class Ejer1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> numberStr = new ArrayList<>();

        numberStr.add("one");
        numberStr.add("two");
        numberStr.add("three");
        numberStr.add("four");
        numberStr.add("five");
        numberStr.add("six");

        for (int i = 0; i < numberStr.size(); i++) {
            System.out.println(i +  ".- " + numberStr.get(i));
        }

        numberStr.add(3, "two");
        numberStr.remove(4);

        System.out.println(numberStr.get(1));
        System.out.println(numberStr.get(3));

        for (int i = 0; i < numberStr.size(); i++) {
            numberStr.add(i, numberStr.get(i).toUpperCase());
            numberStr.remove(i+1);
        }

        for (int i = 0; i < numberStr.size(); i++) {
            System.out.println(i +  ".- " + numberStr.get(i));
        }

        while(numberStr.size()!=0){
            if(numberStr.size()!=0)
                numberStr.remove(0);
        }

        System.out.println("Size: " + numberStr.size());
    }
}
