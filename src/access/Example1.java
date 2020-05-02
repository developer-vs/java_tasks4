package access;

public class Example1 {

    public static void main(String[] args) {

        Example2 ex2 = new Example2();
        ex2.printMe();

        // // Don't let anyone instantiate this class.
        // Example3 ex2 = new Example3();

        Example3.printMe();

        // Math

    }
}
