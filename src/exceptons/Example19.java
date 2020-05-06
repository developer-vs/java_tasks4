package exceptons;

public class Example19 {

    /**
     * To invoke the special main method,
     * JVM loads the class in the memory.
     * At that time, static fields of Example19 class
     * are initialized.
     * d1 is of Double type so null is assigned to it.
     */
    static Double d1;

    /**
     * x is not static variable, so int x = d1.intValue()
     * is not executed.
     *
     * Class is loaded successfully in the memory
     * and "HELLO" is printed on to the console.
     */

    // NOTE: new Example19() will throw NullPointerException
    // but not ExceptionInInitializerError.
    int x = d1.intValue();

    public static void main(String[] args) {
        // "HELLO" will be printed on the console
        System.out.println("HELLO");

        Example19 example19 = new Example19(); // java.lang.NullPointerException
    }
}
