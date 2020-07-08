package interf;

interface B {
    int type = 0; // public static final
    void jump();  // public abstract void
}
public class Test7 implements B {
    Test7() {
        // type = 1; // can't assign a value to final variable
    }

    @Override
    public void jump() {
        System.out.println("jumping..." + type);
    }
    public static void main(String[] args){
        B b = new Test7();
        b.jump();
    }
}
