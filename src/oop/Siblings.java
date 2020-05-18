package oop;

class A {
    public void print() {
        System.out.println("A");
    }
}
class B extends A {
    public void print() {
        System.out.println("B");
    }
}
class C extends A {
    public void print() {
        System.out.println("C");
    }
}
public class Siblings {
    public static void main(String[] args) {
        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C)obj1;
        obj3.print();

        /*
            C obj4 = (C)obj2; => obj2 actually refers to an instance of B class,
            so at runtime obj4 (C type) will refer to an instance of B class.
            B and C are siblings and can't refer to each other,
            so this statement will throw ClassCastException at runtime.
         */
        // C obj4 = (C)obj2;

        A objA = new A();
        B objB = (B)objA;
        objB.print();
        /*
            objA is of type A and it is assigned to objB (B type),
            hence explicit casting is necessary.
            objA refers to an instance of class A, so at runtime
            objB will also refer to an instance of class A.
            sub type can't refer to an object of super type.
            so at runtime B objB = (B)obj1 will throw ClassCastException.
         */
    }
}
