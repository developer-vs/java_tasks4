package access;

import access.test.A;

public class Example6 extends A {
    public void print() {
        A obj = new A();
        System.out.println(obj.i1);

        /*
            Variable i2 is declared protected so it can only
            be accessed in subclass using using inheritance
            but not using object reference variable.
            obj.i2 causes compilation failure.
         */

        // System.out.println(obj.i2);

        /*
            class B inherits variable i2 from class A,
            so inside class B it can be accessed by
            using either this or super.
         */
        System.out.println(this.i2);
        System.out.println(super.i2);
    }

    public static void main(String [] args) {
        new Example6().print();
    }
}
