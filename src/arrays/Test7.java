package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Boolean [] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        System.out.println(list); // [null, null]

        System.out.println(list.remove(0)); // list.remove(0) - return "null"

        if(list.remove(0)) {    // Required type: boolean but was null
            list.remove(1);
        }

        System.out.println(list);
    }
}
