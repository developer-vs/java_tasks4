package exceptons;

public class Example9 {

    static class Base {
        // NullPointerException extends RuntimeException,
        // but there are no overriding rules related
        // to unchecked exceptions.
        public void m1() throws NullPointerException {
            System.out.println("Base: m1()");
        }
    }

    static class Derived extends Base {
        // So, method m1() correctly overrides Base class method
        public void m1() throws RuntimeException {
            System.out.println("Derived: m1()");
        }
    }

    public static void main(String[] args) {
        Base obj = new Derived();
        // hence obj.m1(); invokes method m1() of Derived class,
        // which prints "Derived: m1()" to the console.
        obj.m1(); // Derived: m1()
    }
}
