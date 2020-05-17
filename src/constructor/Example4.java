package constructor;

/**
 * super(); is added by the compiler as the first statement
 * in both the constructors.
 *
 * Class Super extends from Object class and Object class
 * has no-argument constructor,
 * hence no issues with the constructor of Super class.
 *
 * But no-arg constructor is not available in Super class,
 * hence calling super() from Sub class constructor causes
 * compilation error.
 */
class Super {
    // constructor
    public Super(int i) {
        // super(); -> will add by compiler
        System.out.println(100);
    }
}

// class Sub extends Super {
    // constructor
    // public Sub() {
        // super(); -> will add by compiler
        // System.out.println(200);
    // }
// }

public class Example4 {
    public static void main(String[] args) {
        // new Sub();
    }
}
