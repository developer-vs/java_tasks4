package interf;

interface Interf1 {
    // access modifiers: default, protected, private not allowed here
    int i = 10; // for compiler -> public static final int i = 10
    void add(); // for compiler -> public abstract void add()
}
interface Interf2 extends Interf1 {
    int i = 20;
    void sub();
}
public class Test6 implements Interf2 {

    int i = Interf1.i;
    int i2 = Interf2.i;

    public static void main(String[] args) {
//        System.out.println(i);
//        System.out.println(i2);
    }

    @Override
    public void add() {
        i = 1;
    }

    @Override
    public void sub() {

    }
}
