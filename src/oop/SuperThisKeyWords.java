package oop;

public class SuperThisKeyWords {

    static class P {
        String s = "Parent variable";
    }

    static class C extends P {
        String s = "Child variable";

        public void m1() {
            System.out.println(s);          // Child variable
            System.out.println(this.s);     // Child variable
            System.out.println(super.s);    // Parent variable
        }
    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
