package exceptons;

import java.io.FileNotFoundException;

public class Example14 {

    public static void main(String[] args) {
        /**
         * Java doesn't allow to catch specific checked exceptions
         * if these are not thrown by the statements inside try block.
         *
         * catch(FileNotFoundException ex) {} causes  compilation error
         * in this case as System.out.println(1); will never
         * throw FileNotFoundException.
         *
         * NOTE: Java allows to catch Exception type.
         * catch(Exception ex) {} will never cause compilation error.
         */
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");
//        } catch (FileNotFoundException ex) {
//            System.out.println("TWO");
        }
        System.out.println("THREE");
    }
}
