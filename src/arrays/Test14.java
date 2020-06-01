package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test14 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        /**
         * remove method is overloaded: remove(int) and remove(Object).
         * char can be easily assigned to int so compiler tags remove(int) method.
         * list.remove(<ASCCI value of 'O'>); ASCCI value of 'A' is 65
         * so ASCII value of 'O' will be more than 65.
         *
         * list.remove('O') throws runtime exception, as it tries to remove
         * an item from the index greater than 65 but allowed index is 0 to 3 only.
         */
        if(list.contains('O')) {
            list.remove('O'); // RE: 'O' -> Index: 79
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}
