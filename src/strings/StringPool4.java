package strings;

public class StringPool4 {

    public static void main(String[] args) {
        String javaworld = "JavaWorld"; // SCP - "JavaWorld"
        String java = "Java"; // SCP - "Java"
        String world = "World"; // SCP - "World"
        java += world; // Heap - "JavaWorld"
        System.out.println(java == javaworld); // false

        /**
         * Strings computed by concatenation at compile time,
         * will be referred by String Pool during execution.
         * Compile time String concatenation happens when both of
         * the operands are compile time constants,
         * such as literal, final variable etc.
         *
         * Whereas, Strings computed by concatenation at run time
         * (of the resulting expression is not a constant expression)
         * are newly created and therefore distinct.
         */

        /**
         * `java += world;` is same as `java = java + world;` and
         * `java + world` is not a constant expression and hence
         * is calculated at runtime and returns a non pool
         * String object "JavaWorld", which is referred by
         * variable 'java'.
         *
         *
         * On the other hand, variable 'javaworld' refers
         * to String Pool object "JavaWorld".
         * As both the variables 'java' and 'javaworld' refer
         * to different String objects,
         * hence `java == javaworld` returns false.
         */
    }

}
