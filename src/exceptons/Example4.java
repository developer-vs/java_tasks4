package exceptons;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example4 {

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
            /**
             * Even though method m1() declares to throw IOException
             * but at runtime an instance of FileNotFoundException is thrown.
             *
             * A catch handler for FileNotFoundException is available
             * and hence X is printed on to the console.
             *
             * After that finally block is executed,
             * which prints Z to the console.
             */
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("X");
        } catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");
        }
    }
}
