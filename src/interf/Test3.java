package interf;

interface MyInterface {
    void m1();
}
public class Test3 {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("m1 method implementation");
        myInterface.m1();
    }
}
