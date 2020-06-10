package interf;

public class Test4 {
    public static void main(String[] args) {
        Runnable r = () -> {
            print("Lambda");
        };
        Thread t = new Thread(r);
        t.start();
        print("Main");
    }
    private static void print(String s) {
        for (int i = 0; i < 10; i++ ){
            System.out.println(s + " Tread: " + i);
        }
    }
}