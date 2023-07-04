import java.util.Hashtable;

public class Ejer3 {
    public static void main(String[] args) throws Exception {
        Hashtable<String, Integer> numbers = new Hashtable<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);

        System.out.println(numbers.get("three"));
        System.out.println(numbers.get("seven"));
    }
}
