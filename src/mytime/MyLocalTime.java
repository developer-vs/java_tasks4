package mytime;

public class MyLocalTime {

    public static void main(String[] args) {

        /**
         * Example 1
         *
         * Explanation:
         * java.time.DateTimeException:
         * Invalid value for MinuteOfHour (valid values 0 - 59): 60
         *
         * Valid value for hour is: 0 to 23
         * Valid value for second is: 0 to 59
         * Valid value for nano second is: 0 to 999,999,999.
         */
        // LocalTime time = LocalTime.of(23, 60);
        // System.out.println(time);
    }
}
