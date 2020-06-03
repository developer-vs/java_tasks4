package arrays;

import java.util.function.Predicate;

public class Test25 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        /**
         * Let us suppose test string is "aba".
         *
         * Lambda expression s.toUpperCase().substring(0,1).equals("A");
         * means: "aba".toUpperCase().substring(0,1).equals("A");
         * => "ABA".substring(0,1).equals("A"); => "A".equals("A"); => true.
         *
         * This lambda expression returns true for any string starting with a
         * (in lower or upper case).
         * Based on the lambda expression, 5 array elements passes the Predicate's test
         * and are printed on to the console.
         */
        Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");

        processStringArray(arr, p);
    }

    private static void processStringArray(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
