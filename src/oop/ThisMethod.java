package oop;

public class ThisMethod {

    ThisMethod(double d) {
        this(10);
        System.out.println("double-arg constructor");
    }

    ThisMethod(int i) {
        this();
        System.out.println("int-arg constructor");
    }

    ThisMethod() {
        System.out.println("no-arg constructor");
    }

    public static void main(String[] args) {
        ThisMethod thisMethod1 = new ThisMethod(20.5);
        System.out.println("*******************************");
        ThisMethod thisMethod2 = new ThisMethod(10);
        System.out.println("*******************************");
        ThisMethod thisMethod3 = new ThisMethod();
    }
}
