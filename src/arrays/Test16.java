package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test16 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));
        /**
         * List cannot accept primitives, it can accept objects only.
         * So, when 100 and 200 are added to the list, then auto-boxing feature converts these
         * to wrapper objects of Integer type.
         *
         * String class and all the wrapper classes override equals(Object) method,
         * hence at the time of removal when another instance is passes[new Integer(100)],
         * there is no issue in removing the matching item.
         */

        System.out.println(list); // [200, 100, 200]
    }
}
