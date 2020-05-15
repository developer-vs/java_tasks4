package boxingunboxing;

public class Autoboxing2 {

    private static void add(double d1, double d2) {
        System.out.println("double version");
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version");
    }

    public static void main(String[] args) {

        /**
         * add(10.0, new Integer(10)); => 1st parameter is tagged to
         * double primitive type and 2nd parameter is converted to int,
         * is tagged to double primitive type as well.
         * So, add(double, double); method is invoked.
         */
        add(2.0, new Integer(10)); // double version

        add(2.0, new Float(10)); // double version
        add(2.0, 10); // double version
    }
}
