package exceptons;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Example3 {

    abstract static class Super {
        public abstract void m1() throws IOException;
    }

    static class Sub extends Super {
        @Override
        public void m1() throws IOException {
            throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (IOException e) {
            System.out.print("A");

        /**
         * FileNotFoundException extends IOException
         * and hence catch block of FileNotFoundException
         * should appear before the catch block of IOException.
         */

        // } catch (FileNotFoundException e) {
        //    System.out.print("B");

        } finally {
            System.out.print("C");
        }
    }
}
