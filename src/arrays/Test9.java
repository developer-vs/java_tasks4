package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        /**
         * In this question, new ArrayList<>(4); creates an
         * ArrayList instance which can initially store 4
         * elements but currently it doesn't store any data.
         */
        List<String> list = new ArrayList<>(4);
        list.add(0, "Array");
        list.add(2, "List"); // RE

        /**
         * Addition of elements in ArrayList should be continuous.
         * If you are using add(index, Element) method to add items
         * to the list, then index should be continuous,
         * you simply can't skip any index.
         *
         * In this case, list.add(0, "Array"); adds "Array" to 0th index.
         * so after this operation list --> [Array].
         * You can now add at 0th index (existing elements will be shifted right)
         * or you can add at index 1 but not at index 2.
         * list.add(2, "List"); throws an instance of java.lang.IndexOutOfBoundsException.
         */

        System.out.println(list);
    }
}
