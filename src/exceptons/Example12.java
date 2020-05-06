package exceptons;

import java.io.IOException;
import java.util.zip.ZipError;

public class Example12 {

    public static void main(String[] args) {
        /**
         * main(args) method is invoked recursively without
         * specifying any exit condition, so this code ultimately
         * throws java.lang.StackOverflowError.
         *
         * StackOverflowError is a subclass of Error type and
         * not Exception type, hence it is not handled.
         *
         * Stack trace is printed to the console and program ends abruptly.
         *
         *
         * Java doesn't allow to catch specific checked exceptions
         * if these are not thrown by the statements inside try block.
         *
         * catch(java.io.FileNotFoundException ex) {} will cause
         * compilation error in this case as main(args); will never
         * throw FileNotFoundException.
         * But Java allows to catch Exception type, hence catch
         * (Exception ex) {} doesn't cause any compilation error.
         */
        try {
            // Method 'main()' recurses infinitely, and can only end by throwing an exception
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}
