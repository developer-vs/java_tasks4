package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list); // [HelloWorld!, Hello, HelloWorld!]

        /**
         * ArrayList's 1st and 3rd items are referring to same
         * StringBuilder instance referred by sb [sb --> {Hello}] and
         * 2nd item is referring to another instance of StringBuilder.
         *
         * sb.append("World!"); means sb --> {HelloWorld!}, which means
         * 1st and 3rd items of ArrayList now refers to
         * StringBuilder instance containing HelloWorld!
         */
    }
}
