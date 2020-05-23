package overriding;

public class Test1 {
    static class Parent {
        public void property() {
            System.out.println("Sold property");
        }
    }
    static class Child extends Parent {
        @Override
        public void property() {
            System.out.println("Get property");
        }
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.property();           // Sold property
        Child c = new Child();
        c.property();           // Get property

        Parent p1 = new Child();
        p1.property();          // Get property
        /*
            Compiler will check if method property() under Parent class
            is available or not.
            If method not available under parent time then compiler will
            show an error.

            At runtime JVM will check "p1" and it will referred to Child object.
            Under Child class JVM will check if method property() overriding
            or not. If yes, at runtime JVM will call method from Child class.

            In overriding method resolution always takes care by JVM based
            on runtime object.

            Method overriding also call as Runtime Polymorphism
         */
    }
}
