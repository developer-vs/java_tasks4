package mylist;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);

        /**
         * After all the add statements are executed,
         * list contains: [X, Y, X, Y, Z].
         *
         * list.remove(new String("Y")); removes the first occurrence
         * of "Y" from the list, which means the 2nd element of the list.
         * After removal list contains: [X, X, Y, Z].
         *
         * NOTE: String class and all the wrapper classes override
         * equals(Object) method, hence at the time of removal when
         * another instance is passed [new String("Y")], there is no issue
         * in removing the matching item.
         */
    }
}
