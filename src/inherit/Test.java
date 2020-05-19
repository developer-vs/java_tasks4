package inherit;

class P {
    public void m1() {
        System.out.println("Parent");
    }
}

class C extends P {
    public void m2() {
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) {
        P p = new C();
        p.m1();     // Parent
        // p.m2();  // -> compiler error

        C c = new C();
        c.m1();    // Parent
        c.m2();    // Child

        C c1 = (C)p; // -> explicit casting to C
        c1.m2();     // Child
    }
}
