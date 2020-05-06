package exceptons;

import java.io.IOException;

public class Example11 {

    static class ReadTheFile {

        // before
        // static void print() { //Line 4

        static void print() throws Exception { //Line 4

            // Compile-Time Checking of Exceptions
            throw new IOException(); //Line 5
            /**
             * Line 5 throws a checked exception,
             * IOException but it is not declared
             * in the throws clause.
             * So, print method should have throws
             * clause for IOException or the classes
             * in top hierarchy such as Exception
             * or Throwable.
             */
        }
    }

    // before
    public static void main(String[] args) { //Line 10

    // we can handle exception like this or do try-catch
    // public static void main(String[] args) throws Exception { //Line 10

        // before
        // ReadTheFile.print(); //Line 11
        /**
         * After replacing Line 4, Line 11 will start
         * giving error as we are not handling the
         * checked exception.
         *
         * As, print() method throws Exception,
         * so main method should handle Exception
         * or its super type and not it's subtype.
         *
         * Surround Line 11 with below try-catch block:
         */

        try {
            ReadTheFile.print(); //Line 11
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
