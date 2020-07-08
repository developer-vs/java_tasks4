package inherit.b;

import inherit.a.A;

public class B extends A {
    B(){ } // CE: class A has a constructor with default access modifier
    public void  print(){ System.out.println("B"); }
    public static void main(String[] args){
        new B();
    }
}
