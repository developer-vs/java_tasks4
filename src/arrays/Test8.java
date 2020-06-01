package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        /**
         * list1 --> [A, D]
         * list2 --> [B, C]
         *
         * list1.addAll(1, list2); is almost equal to list1.add(1, [B, C]);
         * => Inserts B at index 1, C takes index 2 and D is moved to index 3.
         *
         * list1 --> [A, B, C, D]
         */
        list1.addAll(1, list2);

        System.out.println(list1);
    }
}
