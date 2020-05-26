package overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    class P {
        public void m1() throws Exception {}
        public void m2() throws IOException {} // should be: Exception/Throwable
        public void m3() throws IOException {}
        public void m4() throws IOException {}
        public void m5() throws IOException {}
        public void m6() throws IOException {}
    }
    class C extends P {
        public void m1() throws IOException {}  // OK
        // public void m2() throws Exception {} // CE
        public void m3() throws IOException, FileNotFoundException {} // OK
        // public void m4() throws IOException, InterruptedException {} // CE: InterruptedException is not a child of IOException
        public void m5() throws EOFException, NullPointerException {} // CE: EOFException - ok, NPE - CE
        public void m6() throws ArithmeticException, NullPointerException {} // OK, they are both unchecked exceptions
    }
}
