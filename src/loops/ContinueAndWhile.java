package loops;

public class ContinueAndWhile {
    public static void main(String[] args) {
        int x = 0;
        while(x < 4) {
            System.out.println(x+1);
            if(x == 2) {    // infinitive loop
                System.out.println(x);
                continue;
            }
            x++;
        }
        System.out.println(x);
    }
}
