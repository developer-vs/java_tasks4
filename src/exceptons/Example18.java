package exceptons;

public class Example18 {

    /**
     * To invoke the special main method,
     * JVM loads the class in the memory.
     * At that time, static fields of Example18 class
     * are initialized.
     * d1 is of Double type so null is assigned to it.
     */
    static Double d1; // null

    /**
     * x is also static variable so d1.intValue() is
     * executed and as d1 is null hence d1.intValue()
     * throws a NullPointerException and as a result
     * an instance of java.lang.ExceptionInInitializerError is thrown.
     */
    static int x = d1.intValue(); // NullPointerException

    public static void main(String[] args) {
        // "HELLO" will not be printed on the console
        System.out.println("HELLO");
    }
}
