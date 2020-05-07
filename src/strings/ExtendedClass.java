package strings;

/**
 * String is a final class so it cannot be extended.
 */

// before
// public class ExtendedClass extends String {

public class ExtendedClass {

    @Override
    public String toString() {
        return "TEST";
    }

    public static void main(String[] args) {
        ExtendedClass obj = new ExtendedClass();
        System.out.println(obj);
    }
}
