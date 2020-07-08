package overloading;

public class Test1 {

    public static int setVar(int a, int b, float c) {
        return 0;
    }

    public static float setVar(int a){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(setVar(1, 2, 3));
        System.out.println(setVar(4));
    }
}
