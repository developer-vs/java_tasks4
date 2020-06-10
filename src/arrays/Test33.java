package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test33 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);
        System.out.println(list.get(0) == list.get(1)); // false
        System.out.println(list.get(0) == list.get(2)); // true
        list.removeIf(i -> i == 110);
        System.out.println(list); // []

        Integer i = 110;
        list.add(i);
        list.add(new Integer(i));
        list.add(i);
        System.out.println(list.get(0) == list.get(1)); // false
        System.out.println(list.get(0) == list.get(2)); // true
        list.removeIf(x -> x == 110);
        System.out.println(list); // []
    }
}