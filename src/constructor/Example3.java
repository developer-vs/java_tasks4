package constructor;

class A {
    A() {
        this(1);
        System.out.println("M");
    }

    A(int i) {
        System.out.println("N");
    }
}

class B extends A {
    // compiler will add default constructor
    // B() {
    //    super();
    // }
}

public class Example3 {
    public static void main(String[] args) {
        new B(); // NM
        /**
         * On executing new B() statement,
         * class B's default constructor is invoked,
         * which invokes no-arg constructor of class A [super();].
         *
         * no-arg constructor of class A invokes
         * parameterized constructor of class A [this(1);].
         *
         * N is printed first and after that M is printed.
         */
    }
}
