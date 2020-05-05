package exceptons;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example5 {

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
             * Even though an instance of FileNotFoundException is thrown
             * by method m1() at runtime, but method m1() declares
             * to throw IOException.
             *
             * Reference variable s is of Super type and hence for compiler,
             * call to s.m1(); is to method m1() of Super,
             * which throws IOException.
             *
             * And as IOException is checked exception hence calling
             * code should handle it.
             *
             * As calling code doesn't handle IOException or its super type,
             * so s.m1(); causes compilation error.
             */
            // s.m1();
        // } catch (FileNotFoundException e) {
            System.out.print("M");
        } finally {
            System.out.print("N");
        }
    }
}
