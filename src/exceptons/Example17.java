package exceptons;

public class Example17 {

    /**
     * To invoke the special main method,
     * JVM loads the class in the memory.
     *
     * At that time, static initializer block is invoked.
     * 1/0 throws a RuntimeException and as a result
     * static initializer block throws an instance
     * of java.lang.ExceptionInInitializerError caused
     * by: java.lang.ArithmeticException: / by zero
     */
    static {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        // "HELLO" will not be printed on the console
        System.out.println("HELLO");
    }
}
