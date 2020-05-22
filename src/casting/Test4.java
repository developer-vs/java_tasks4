package casting;

public class Test4 {
    static class A {
        int x = 777;
    }
    static class B extends A {
        int x = 888;
    }
    static class C extends B {
        int x = 999;
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);            // C - reference object
        System.out.println(((B)c).x);       // B - reference object
        System.out.println(((A)((B)c)).x);  // A - reference object
        /*
            Variable resolution takes care by compiler based on reference object.
         */
    }
}
