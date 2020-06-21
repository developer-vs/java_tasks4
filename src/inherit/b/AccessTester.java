package inherit.b;

import inherit.a.AccessTest;

public class AccessTester extends AccessTest {
    public static void main(String[] args) {
        AccessTest ref = new AccessTest();
        // ref.a;   // CE: default int a -> is in a different package
        // ref.b;   // CE: private int b;
        ref.d(); // OK: public int d(){  return 0; }

        // In this case, the declared type of ref is AccessTest,
        // which is not of the same type as the class from which you are
        // trying to access c().
        // Therefore, you cannot do ref.c() in AccessTester.
        // ref.c(); // CE: protected void c(){ }

        // protected member is accessible in the subclass only using a
        // reference whose declared type is of the same subclass (or its subclass.)
        // Example:
        AccessTester ref2 = new AccessTester();
        ref2.c();

        // For example, the following would be valid as well.
        // SubAccessTester ref3 = new SubAccessTester();
        // ref3.c(); //this is valid
    }
}