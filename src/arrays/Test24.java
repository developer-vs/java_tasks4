package arrays;

import java.util.function.Predicate;

public class Test24 {
    public static void main(String[] args) {
        String[] arr = {"*", "**", "***", "****", "*****", "******"};
        Predicate<String> pr = s -> s.length() < 4;
        print(arr, pr);
    }

    private static void print(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
