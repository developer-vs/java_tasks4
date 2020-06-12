package boxingunboxing;

public class Equality {
    public static void main(String[] args) {
        Integer i = new Integer(0);
        Integer j = new Integer(0);

        // The two objects are both equal to 0
        System.out.println(i == 0 && j == 0); // true

        // But they are not equal to each other
        System.out.println(i == j); // false

        // true: relational ops unbox both sides
        System.out.println(i <= j && i >= j); // true


        Integer i2 = 127;
        Integer j2 = 127;
        System.out.println(i2 == j2); // true

        Integer i3 = 128;
        Integer j3 = 128;
        System.out.println(i3 == j3); // false

        /**
         * The reason is that the autoboxing spec requires that small integers
         * (-128 to 127) always box to the same wrapper object.
         * Implementations are encouraged, but not required, to do the same for
         * larger values as well.
         * So if we used 128 instead of 0 in the code above it will print "false".
         */
    }
}
