package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null)); // null:true

        /**
         * remove(int) returns the deleted member of the list.
         * In this case `list.remove(0);` returns null as null was deleted from the 0th index.
         *
         * remove(Object) returns true if deletion was successful otherwise false.
         *
         * In this case `list.remove(null)` removes first null from the list and returns true.
         */
    }
}
