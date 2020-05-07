package stringbuffer;

public class SpecialString {

    String str;
    SpecialString(String str) {
        this.str = str;
    }

    public static class Test {
        public static void main(String[] args) {
            System.out.println(new String("Java")); // Java
            System.out.println(new StringBuilder("Java")); // Java
            System.out.println(new SpecialString("Java")); // stringbuffer.SpecialString@74a14482

            /**
             * String and StringBuilder classes override toString() method,
             * which prints the text stored in these classes.
             *
             * SpecialString class doesn't override toString() method
             * and hence when instance of SpecialString is printed on
             * to the console, you get:
             * <fully qualified name of SpecialString class>@<hexadecimal representation of hashcode>.
             */
        }
    }
}
