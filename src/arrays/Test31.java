package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test31 {
    public static void main(String[] args) {
        Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(new Integer(i));
        list.add(i);

        // list.removeIf(i -> i == 10); // CE: Variable 'i' is already defined in the scope

        System.out.println(list);
    }
}
