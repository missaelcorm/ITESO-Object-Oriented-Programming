import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

import iteso.libs.datelib.Date;

public class App {

    public static void print(Collection<?> collection) {
        for (Object object : collection) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static int countElements(Collection<?> collection) {
        return collection.size();
    }

    public static double greatestNumber(Collection<Number> collection) {
        Number G = null;

        for (Number N : collection)
            if (G == null || N.doubleValue() > G.doubleValue())
                G = N;

        return G.doubleValue();
    }

    public static ArrayDeque<Object> ArrayDequeNumberToArrayDequeObject(ArrayDeque<?> arr){
        ArrayDeque<Object> newArr = new ArrayDeque<>();
        for (Object object : arr) {
            newArr.add(object);
        }

        return newArr;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Double> arrList = new ArrayList<>();
        LinkedList<Integer> linkList = new LinkedList<>();
        Stack<Date> stack = new Stack<>();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<Integer> hashInt = new HashSet<>();
        HashSet<Number> hashNum = new HashSet<>();

        ArrayDeque<Number> arrDeqNum = new ArrayDeque<>();


        for (double i = 0; i < 9; i++) {
            Date date = new Date(2002, (int) i + 1, (int) i + 1);
            arrList.add((i + i / 10));
            linkList.add((int) i);
            stack.add(date);
            hashSet.add("\"" + Integer.toString((int) i) + "\"");

            hashInt.add((int)i);
            hashNum.add((int)i);

            arrDeqNum.add(i);
        }

        print(arrList);
        print(linkList);
        print(stack);
        print(hashSet);

        System.out.println("Size of arrList: " + countElements(arrList));
        System.out.println("Size of linkList: " + countElements(linkList));
        System.out.println("Size of stack: " + countElements(stack));
        System.out.println("Size of hashSet: " + countElements(hashSet));

        System.out.print("Greates Number hashNum: \b\t");
        System.out.println(greatestNumber(hashNum));
        /*System.out.print("Greates Number hashInt: \b\t");
        System.out.println(greatestNumber(hashInt)); /* The method greatestNumber(Collection<Number>) 
                                                        in the type App is not applicable for the arguments 
                                                        (HashSet<Integer>)Java(67108979) */
        
        ArrayDeque<Object> arrDeqObj = new ArrayDeque<>();
        arrDeqObj = ArrayDequeNumberToArrayDequeObject(arrDeqNum);
        System.out.print("Deque Object: \b\t");
        print(arrDeqObj);
        System.out.print("Deque Number: \b\t");
        print(arrDeqNum);
    }
}