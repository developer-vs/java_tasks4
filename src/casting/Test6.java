package casting;

public class Test6 {

    static class A {}
    static class B1 extends A {}
    static class B2 extends A {}
    static class C extends B1 {}

    public static void main(String[] args) {
        A a = new A();
        B1 b1 = new B1();
        B2 b2 = new B2();
        C c = new C();

        // b1 = a;      // CE. Sub-class reference variable "b1" referring to an instance of super-class.
        // b1 = (B1)a;  // RE. ClassCastException. When you try to cast super-class object to sub-class.
        // b1 = b2;     // CE. Siblings (both B1 and B2 extend from A) can't be assigned to each other.
        // b1 = (B1)b2; // CE. Siblings (both B1 and B2 extend from A) can't be casted to each other.
        a = c;          // No issues as super-class reference variable can easily refer to an instance of sub-class.
        a = (B1)c;      // No issues as instance of sub-class ["c" (of type C)] can easily to casted to instance of
                        // super-class (B1). And reference variable "a" (of type A) can refer to an instance of B1.

        // C c1 = new B1(); // incompatible types: B1 cannot be converted to C
    }
}
