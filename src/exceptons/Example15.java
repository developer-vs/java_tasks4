package exceptons;

import java.io.FileNotFoundException;

public class Example15 {

    public class Class1 {
        /**
         *
         * Method declaring checked exception in its throws clause
         * doesn't mean that it should have code to actually throw
         * that type of Exceptions.
         * So even though read() method of Class1 declares to throw
         * FileNotFoundException but its body doesn't actually throw
         * an instance of FileNotFoundException.
         */
        public void read() throws FileNotFoundException {}
    }

    public class Class2 {
        /**
         *
         * Variable and method name can be same as class name,
         * so code of Class2 is also valid.
         * Remember: Though you don't get any compilation error
         * but it is not recommended to use the Class name for
         * variable and method names.
         */
        String Class2;
        public void Class2() {}
    }

    public class Class3 {
        private void print() {
            /**
             *
             * LOCAL variable can be declared with final modifier only.
             * msg variable inside print() method of Class3 is declared
             * private and this causes compilation error.
             */
//            private String msg = "HELLO";
//            System.out.println(msg);
        }
    }
}
