package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test27 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);

        /**
         * removeIf(Predicate) method was added as a default method
         * in Collection interface in JDK 8 and it removes all the
         * elements of this collection that satisfy the given predicate.
         *
         * Predicate's test method returns true for all the Integers divisible by 10.
         */
        list.removeIf(a -> a % 10 == 0);

        System.out.println(list); // [7, 17, 5]
    }
}
