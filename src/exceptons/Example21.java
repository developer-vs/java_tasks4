package exceptons;

public class Example21 {

    Object m1(){
        return new Object();
    }

    void m2(){
        String s = (String) m1(); // RE: java.lang.Object cannot be cast to java.lang.String
    }

    public static void main(String[] args) {
        Example21 exm = new Example21();
        exm.m2();
    }
}
