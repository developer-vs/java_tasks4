package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        /**
         * StringBuilder class doesn't override equals(Object) method
         * and hence days.contains(new StringBuilder("Sunday")) returns false.
         *
         * Code inside if-block is not executed and days.size() returns 3.
         */
        if(days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());
    }
}
