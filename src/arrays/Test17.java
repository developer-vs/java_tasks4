package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test17 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape"); // rm
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        /**
         * fruits.remove("grape") removes the first occurrence of "grape" and
         * after the successful remove, returns true,
         * control goes inside if block and executes fruits.remove("papaya");
         *
         * fruits list doesn't have "papaya", so the list remain unchanged.
         */
        if(fruits.remove("grape"))
            fruits.remove("papaya");

        System.out.println(fruits); // [apple, orange, mango, banana, grape]
    }
}
