package interf;

interface  Interf {
    // if we don't need to create an object,
    // better to use interface with static method

    // by default static method not available for implementation classes
    static void m1() {
        System.out.println("Interface with static method");
    }
}
public class Test2 {

    public static void main(String[] args) {
        // How to call static method?

        // example 1 -> valid !!! -> will work even without
        // "public class Test2 implements Interf"
        Interf.m1();

        // example 2 -> invalid
        // m1();

        // example 3 -> invalid
        // Test2.m1();

        // example 4 -> invalid
        // Test2 t = new Test2();
        // t.m1();
    }
}
