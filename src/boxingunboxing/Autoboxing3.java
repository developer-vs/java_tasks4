package boxingunboxing;

public class Autoboxing3 {

    private static void add(Double d1, Double d2) {
        System.out.println("Double version");
    }

    public static void main(String[] args) {
        add(20.0, 10.0);
        add(null, null);

        /**
            int can be converted to double but Integer type can't be
            converted to Double type as Integer and Double are siblings
            (both extends from Number class) so can't be casted to each other.
         */

//        add(2.0, new Integer(10)); // new Integer(10) -> compiler error
//        add(2.0, new Float(10)); // new Float(10) -> compiler error
//        add(2.0, new Long(10)); // new Long(10) -> compiler error
//        add(2.0, new Short(10)); // new Short(10) -> compiler error
//        add(2.0, 10); // 10 -> compiler error
    }
}
