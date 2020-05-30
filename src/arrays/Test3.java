package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        /**
         * for-each loop internally implements Iterator
         * and invokes hasNext() and next() methods.
         *
         * hasNext() method of Iterator has following implementation:
         *
         * public boolean hasNext() {
         *     return cursor != size;
         * }
         * Where cursor is the index of next element to return and initially it is 0.
         *
         * 1st Iteration: cursor = 0, size = 4, hasNext() returns true.
         * iterator.next() increments the cursor by 1 and returns "Walnut".
         *
         * 2nd Iteration: cursor = 1, size = 4, hasNext() returns true.
         * iterator.next() increments the cursor by 1 and returns "Apricot".
         * As "Apricot" starts with "A", hence dryFruits.remove(dryFruit) removes
         * "Apricot" from the list and hence reducing the list's size by 1,
         * size becomes 3.
         *
         * 3rd Iteration: cursor = 2, size = 3, hasNext() returns true.
         * iterator.next() method throws java.util.ConcurrentModificationException.
         *
         * Using List.remove(...) method while iterating the list
         * (using the Iterator/ListIterator or for-each) may throw
         * java.util.ConcurrentModificationException.
         *
         * If you want to successfully remove the items from ArrayList,
         * while using Iterator or ListIterator, then use Iterator.remove() or
         * ListIterator.remove() method and NOT List.remove(...) method.
         */
        for(String dryFruit : dryFruits) {
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
            System.out.println(dryFruit);
        }

        System.out.println(dryFruits);
    }
}
