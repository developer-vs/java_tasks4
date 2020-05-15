package boxingunboxing;

public class Autoboxing {

    private static void add(Integer i, Integer j) {
        System.out.println("Integer version");
    }

    public static void main(String[] args) {
        // auto-boxing will convert literal 10 and 20 to Integer instance
        add(10, 20); // int version

        // this statement is specifically calling add(Integer, Integer)
        add(new Integer(10), new Integer(20));

        // as Integer is reference type, hence add(null, null) maps to
        // add(Integer, Integer)
        add(null, null);

        // 10.0 and 20.0 are default literals and can't be mapped to int
        // or Integer types, hence this gives compilation error.
        // add(10.0, 20.0);
    }
}
