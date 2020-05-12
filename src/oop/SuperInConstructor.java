package oop;

public class SuperInConstructor {

    /**
     * Example 1
     * Valid code
     */
    class P1 {
        /*
            Default constructor
            P1() {
                super();
            }
         */
    }

    class C1 extends P1 {
        /*
            Default constructor
            C1() {
                super(); // call the P1 default constructor
            }
         */
    }

    /**
     * Example 2
     * Valid code
     */
    class P2 {
        P2() {
            // super() - call by default
        }
    }

    class C2 extends P2 {
        /*
            Default constructor
            C2() {
                super(); // call the P2 constructor
            }
         */
    }

    /**
     * Example 3
     * Invalid code
     */
    class P3 {
        P3(int i) {
            // super() - call by default
        }
    }

    // class C3 extends P3 {
        /*
            Compiler call default constructor
            C3() {
                super(); - call the P3 constructor but it has one argument
                         - and we will get compiler error
            }
         */
    // }

    /**
     * Example 4
     * Valid code -> solution 1
     */
    class P4a {
        P4a(int i) {
            // super() - call by default
        }
    }

    class C4a extends P4a {
        // We need to create a constructor
        C4a() {
            super(10); // call the P4a constructor
        }
    }

    /**
     * Example 5
     * Valid code -> solution 2
     */
    class P4b {
        // Highly recommenced to use empty constructor
        // if we have constructor with parameters
        P4b() {
            // super() - call by default
        }

        P4b(int i) {
            // super() - call by default
        }
    }

    class C4b extends P4b {
        /*
            Compiler call the default constructor
            C4b() {
                super(); - call the P4b constructor without argument
            }
         */
    }
}
