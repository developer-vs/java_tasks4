package strings;

public class MethodOverloaded {

    public static void main(String[] args) {
        m1(null);  // String
    }

    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }

    /**
     * Method m1 is overloaded to accept 3 different parameters:
     * String, CharSequence and Object and as these are related
     * in multilevel inheritance, hence m1(null) is mapped to
     * the class lowest in hierarchy, which is String class.
     * Hence, output will be "String".
     *
     * Now if you add one more overloaded method,
     * `static void m1(StringBuilder s) {...}` in the Test class,
     * then `m1(null);` would cause compilation error as
     * StringBuilder and String classes are not related to each other
     * in multilevel inheritance.
     *
     * m1(null); would match to both m1(String) and m1(StringBuilder),
     * so m1(null) in that case would be ambiguous call and
     * would cause compilation error.
     *
     * For the same reason, System.out.println(null); causes compilation error
     * as println method is overloaded to accept 3 reference types:
     * Object,
     * String,
     * char []
     * along with primitive types.
     *
     * System.out.println(null); matches to both println(char[]) and println(String),
     * so it is an ambiguous call and hence the compilation error.
     */
}
