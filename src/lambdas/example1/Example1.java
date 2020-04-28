package lambdas.example1;

import java.util.function.Predicate;

public class Example1 {

        public static void main(String[] args) {

            // lambda expression
            Square i = n -> n * n;
            System.out.println("The Square of 4 is: " + i.squareIt(4));

            Demo demo = new Demo();
            System.out.println("The Square of 5 is: " + demo.squareIt(5));

            Square d = new Demo();
            System.out.println("The Square of 7 is: " + d.squareIt(7));

            Example1 t = new Example1();
            System.out.println("test: " + t.test(20));
            System.out.println("test: " + t.test(5));

            // lambda expression with Functional Interface = Predicate
            Predicate<Integer> p = x -> x > 10;
            System.out.println("is 20 grater then 10: " + p.test(20));
            System.out.println("is 1 grater then 10: " + p.test(1));

            Predicate<Integer> isEven = x -> x % 2 == 0;
            System.out.println("is 20 even number: " + isEven.test(20));
            System.out.println("is 1 even number: " + isEven.test(1));


            String[] arr = {"one", "two", "tree", "four"};
            Predicate<String> isExist = s -> s.charAt(0) == 't';
            System.out.println("The word which starts at 't' is: ");
            for (String a : arr) {
                if (isExist.test(a)) {
                    System.out.println(a);
                }
            }
        }

        private static class Demo implements Square {

            @Override
            public int squareIt(int n) {
                return n * n;
            }
        }

        // java.util.function - Predicate (functional interface)
        // interface Predicate<T> {
        //    boolean newTest(T t);
        // }

        private boolean test(int x) {
            return x > 10;
        }
}
