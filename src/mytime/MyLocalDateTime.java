package mytime;

import java.time.LocalDateTime;

public class MyLocalDateTime {

    public static void main(String[] args) {

        /**
         * Example 1
         *
         * Explanation:
         * LocalDateTime stores both date and time parts.
         * LocalDateTime.now(); retrieves the current date and time
         * from the system clock.
         *
         * obj.getSecond() can return any value between 0 and 59.
         */
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());
    }
}
