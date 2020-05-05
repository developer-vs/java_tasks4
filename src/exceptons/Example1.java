package exceptons;

public class Example1 extends Exception {

    public Example1() {
        super();
    }

    public Example1(String s) {
        super(s);
    }

    public class Test {
        /**
         *
         * Method m1() throws an instance of Example1,
         * which is a checked exception as it extends Exception class.
         *
         * So in throws clause we must provide: Checked exception.
         */
        public void m1() throws Exception {
            throw new Example1();
        }
    }
}