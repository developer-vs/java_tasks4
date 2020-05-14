package interf;

interface Left {
    default void m1() {
        System.out.println("Left Interface m1 method");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right Interface m1 method");
    }
}
public class Test1 implements Left, Right {

    // we need to override m1 method, otherwise we will get compiler error
    @Override
    public void m1() {
        // System.out.println("Our own m1 method");

        // if we want method m1 from interface Left
        //Left.super.m1();

        // if we want method m1 from interface Right
        Right.super.m1();
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1();
    }
}
