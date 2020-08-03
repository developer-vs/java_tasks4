package mystatic;

public class StaticTest {

    void m1(){
        StaticTest.m2();  // 1
        m4();             // 2
        // StaticTest.m3();  // 3 - Non-static method 'm3()' cannot be referenced from a static context
        m3();
    }

    static void m2(){ }  // 4

    void m3(){
        m1();            // 5
        m2();            // 6
        // StaticTest.m1(); // 7 - Non-static method 'm3()' cannot be referenced from a static context
    }

    static void m4(){ }

    static void m5(){
        m4();            // 8
        // m3();         // 9 - Non-static method 'm3()' cannot be referenced from a static context
    }
}
