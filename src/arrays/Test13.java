package arrays;

import java.util.List;

public class Test13 {
    /**
     * Generic type can only be reference type and not
     * primitive type, hence List<int> is not a valid syntax.
     *
     * If you use raw type List or List<Object> then Line 3
     * will give compilation error as list.get(0) will
     * return Object type.
     * Object type cannot be converted to primitive type int,
     * so List and List<Object> will cause compilation failure of Line 3.
     */
    public static void process(List<Integer> list) {
        list.add(100); //Line 2
        int x = list.get(0); //Line 3
        System.out.println(list.size() + ":" + x);
    }
}
