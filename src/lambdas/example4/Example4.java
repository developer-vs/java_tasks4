package lambdas.example4;

import java.util.function.Predicate;

public class Example4 {

    public static void main(String[] args) {
        String[] numbers = {"One", "Two", "Tree", "Four"};
        Predicate<String> p = s -> s.charAt(0) == 'T';
        System.out.println("The Strings starts with 'T' are: ");
        for (String number : numbers) {
            if (p.test(number)) {
                System.out.println(number);
            }
        }
    }
}
