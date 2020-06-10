package interf;

public class Test5 {
    @FunctionalInterface
    interface Interf1 {
        void m1(int i);
    }
    // Regular Interface
    interface Interf2 {
        void m1(int i);
        void m2(int i);
    }
    // Regular Interface
    interface Interf3 {
        void m1(int i);
        void m1(String s);
    }

    public static void main(String[] args) {
        Interf1 I = i -> System.out.println(i*i);
        I.m1(10);
        I.m1(20);
    }

    // Interf2 I = i -> System.out.println(i*i); // CE:
    /**
     * incompatible types: Interf2 is not a functional interface
     * multiple non-overriding abstract methods found in interface Interf2
     */

    // Interf3 I = i -> System.out.println(i*i); // CE
    /**
     * incompatible types: Interf2 is not a functional interface
     * multiple non-overriding abstract methods found in interface Interf2
     */
}
