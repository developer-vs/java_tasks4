package exceptons;

public class Example6 {

    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            /**
             * Method m1() throws an instance of ArithmeticException
             * and method m1() doesn't handle it, so it forwards
             * the exception to calling method main.
             *
             * Method main doesn't handle ArithmeticException so it
             * forwards it to JVM, but just before that finally block
             * is executed.
             * This prints A on to the console.
             *
             * After that JVM prints the stack trace and terminates
             * the program abruptly.
             */
            m1();
        } finally {
            System.out.println("A");
        }
    }
}
