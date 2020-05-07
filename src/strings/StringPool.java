package strings;

public class StringPool {

    public static void main(String[] args) {

        /**
         * Compile time String concatenation happens
         * when both of the operands are compile time constants,
         * such as literal, final variable etc.
         *
         * For the statement, String s2 = "OCAJP" + "";,
         * "OCAJP" + "" is a constant expression as both the operands
         * "OCAJP" and "" are String literals,
         * which means the expression "OCAJP" + "" is computed at
         * compile-time and results in String literal "OCAJP".
         *
         * So, during compilation, Java compiler translates the statement
         *
         * String s2 = "OCAJP" + "";
         * to
         * String s2 = "OCAJP";
         *
         *
         * As "OCAJP" is a String literal, hence at runtime it will be
         * referred by String Pool.
         *
         * When StringPool class is executed,
         *
         * s1 refers to "OCAJP" (String Pool object).
         *
         * s2 also refers to same String pool object "OCAJP".
         *
         * s1 and s2 both refer to the same String object and that is
         * why s1 == s2 returns true.
         *
         */

        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);


        /**
         *
         * NOTE:
         * Whereas, Strings computed by concatenation at run time
         * (of the resulting expression is not a constant expression)
         * are newly created and therefore distinct.
         *
         * For below code snippet:
         *
         * String s3 = "OCAJP";
         * String s4 = s3 + "";
         * System.out.println(s3 == s4);
         *
         * Output is false, as s3 is a variable and `s3 + ""` is not a
         * constant expression, therefore this expression is computed
         * only at runtime and a new non-pool String object is created.
         */

        String s3 = "OCAJP";
        String s4 = s3 + "";
        System.out.println(s3 == s4);
    }
}
