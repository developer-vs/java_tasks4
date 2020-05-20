package casting;

class P {
    public void m1() {
        System.out.println("P");
    }
}
class C extends P {
    public void m2() {
        System.out.println("C");
    }
}
public class Test2 {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
        ((P)c).m1();
         // ((P)c).m2(); CE -> "c" will become the parent type "P"
         //                    but internally will be only one "C" object.

        // ((P)c) -> P p = ((P)c)
        P p = ((P)c);
        p.m1(); // ok
        // p.m2(); -> CE: under parent type only m1() is available

        System.out.println(c == p); // true

        // or ((P)c) -> P p1 = new C()

        P p1 = new C();
        p1.m1();
        // p1.m2(); // CE
        System.out.println(c == p1); // false
    }
}
