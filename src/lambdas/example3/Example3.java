package lambdas.example3;

import java.util.function.Predicate;

public class Example3 {

    public static void main(String[] args) {

        int[] numbers = {0, 5, 7, 9, 10, 20, 25, 30, 35};
        Predicate<Integer> graterThen10 = i -> i > 10;
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println("Numbers greater than 10 are:");
        getResult(graterThen10, numbers);
        System.out.println("Even numbers are:");
        getResult(isEven, numbers);
        System.out.println("Numbers that are greater than 10 and even are:");
        getResult(graterThen10.and(isEven), numbers);
        System.out.println("Numbers that are greater than 10 or even are:");
        getResult(graterThen10.or(isEven), numbers);
        System.out.println("Numbers that are not greater than 10:");
        getResult(graterThen10.negate(), numbers);
    }

    public static void getResult(Predicate<Integer> p, int[] arr) {
        for (int num : arr) {
            if (p.test(num)) {
                System.out.println(num);
            }
        }
    }
}
