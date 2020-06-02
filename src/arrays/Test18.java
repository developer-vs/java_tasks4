package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test18 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100); // RE: IndexOutOfBoundsException: Index: 100

        System.out.println(list);
    }
}
