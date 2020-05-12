package loops;

import java.util.HashMap;

public class Continue {

    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            // if false -> sum += start;
            // if true -> while(++start <= 10)
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);
    }
}
