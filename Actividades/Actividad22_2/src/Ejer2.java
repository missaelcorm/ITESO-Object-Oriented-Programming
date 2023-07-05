import java.util.HashSet;

public class Ejer2 {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> numbers  = new HashSet<>();

        numbers.add(100);
        numbers.add(150);
        numbers.add(120);
        numbers.add(100);
        numbers.add(180);
        numbers.add(200);
        numbers.add(120);
        numbers.add(180);
        numbers.add(100);

        System.out.println("Size: " + numbers.size());

        for (Integer integer : numbers) {
            System.out.println(integer);
        }
    }
}
