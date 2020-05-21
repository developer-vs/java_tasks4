package casting;

public class Test3 {
    static class A {
        public void m1() {
            System.out.println("A");
        }
    }
    static class B extends A {
        @Override
        public void m1() {
            System.out.println("B");
        }
        public void m2() {
            System.out.println("m2");
        }
    }
    static class C extends B {
        @Override
        public void m1() {
            System.out.println("C");
        }
        public void m3() {
            System.out.println("m3");
        }
    }
    public static void main(String[] args) {
        /*
            In this example we are using Overriding concept.
            Overriding method resolution always takes care
            by JVM based on runtime object.
            Method Overloading takes by Compiler.
         */

        // For all these cases runtime object is always "C".

        C c = new C();    // c -> reference to object "C" at runtime
        c.m1();           // runtime object is a "C".
        ((B)c).m1();      // "c" will become the parent type "B",
                          // but even we perform type casting,
                          // at runtime time the internal object will be "C" only.
        ((A)((B)c)).m1(); // runtime object is a "C".

        ((B)c).m1();    // overriding -> m1() -> "C"
        ((B)c).m2();    // without overriding -> m2() -> "m2", available only under
                        // "B" object.
        // ((B)c).m3(); // CE
    }
}
