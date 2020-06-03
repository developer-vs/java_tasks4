package arrays;

import java.util.function.Predicate;

public class Test26 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        // processStringArray(arr, p -> true);
        // processStringArray(arr, p -> !false);
        // processStringArray(arr, p -> p.length() >= 1);
        processStringArray(arr, p -> p.length() < 10);
    }

    private static void processStringArray(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
