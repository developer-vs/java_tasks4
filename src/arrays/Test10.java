package arrays;

import java.util.ArrayList;

public class Test10 {
    static class Counter {
        int count;
        Counter(int count) {
            this.count = count;
        }

        public String toString() {
            return "Counter-" + count;
        }
    }
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;

        // In this case, original != cloned, but original.get(0) == cloned.get(0).
        // This means both the array lists are created at different memory location
        // but refer to same Counter object.

        System.out.println(original);
    }
}
