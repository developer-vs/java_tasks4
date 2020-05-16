package boxingunboxing;

public class Autoboxing5 {

    static int extractInt(Double d) {
        return d.intValue();
    }

    public static void main(String[] args) {
        System.out.println(extractInt(2.5)); // ok
        // System.out.println(extractInt(2));   // fail
        /**
         * At first, compiler will convert int to double (implicit casting)
         * and then will try to convert into to Double. (Autoboxing)
         * Compiler can't do both operation at the same time,
         * only one operation.
         */
    }
}
