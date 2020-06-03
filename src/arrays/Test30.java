package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);

        list.removeIf(i -> i == 110);
        System.out.println(list); // []

        /*
         * As list can store only wrapper objects and not primitives, hence
         * for list.add(110); auto-boxing creates an Integer object {110}.
         *
         * for list.add(new Integer(110)); as new keyword is used so another
         * Integer object {110} is created.
         *
         * for 3rd add method call, list.add(110); auto-boxing kicks in and as
         * 110 is between -128 to 127, hence Integer object created at
         * 1st statement is referred.
         *
         * removeIf(Predicate) method was added as a default method in Collection interface
         * in JDK 8 and it removes all the elements of this collection that satisfy the
         * given predicate.
         *
         * Boolean expression is : i == 110; in this expression i is wrapper object and
         * 110 is int literal so java extracts int value of wrapper object, i and then equates.
         * As all the 3 objects store 110, hence true is returned.
         * All integer objects are removed form the list.
         *
         * If list.removeIf(i -> i == new Integer(110)); was used, then all three list elements
         * would return false as object references are equated and not contents.
         */
    }
}
