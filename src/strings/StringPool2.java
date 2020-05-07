package strings;

public class StringPool2 {

    public static void main(String[] args) {

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
        final String fName = "James";
        String lName = "Gosling";
        /**
         * fName is a constant variable and lName is a non-constant variable.
         *
         * `fName + lName` is not a constant expression and hence the
         * expression will be computed at run-time and the resultant
         * String object "JamesGosling" will not be referred by String Pool.
         */
        String name1 = fName + lName; // heap - JamesGosling

        /**
         * As fName is constant variable and "Gosling" is String literal,
         * hence the expression `fName + "Gosling"` is a constant expression,
         * therefore expression is computed at compile-time and results in
         * String literal "JamesGosling".
         *
         * So, during compilation, Java compiler translates the statement
         *
         * String name2 = fName + "Gosling";
         * to
         * String name2 = "JamesGosling";
         *
         * As "JamesGosling" is a String literal, hence at runtime it
         * will be referred by String Pool.
         *
         * So, at runtime name1 and name2 refer to different String object
         * and that is why name1 == name2 returns false.
         */
        String name2 = fName + "Gosling"; // SCP - JamesGosling

        /**
         * `"James" + "Gosling"` is also a constant expression and
         * hence Java compiler translates the statement
         *
         * String name3 = "James" + "Gosling";
         * to
         * String name3 = "JamesGosling";
         *
         * This means at runtime, variable 'name3' will refer to the
         * same String pool object "JamesGosling", which is referred
         * by variable 'name2'.
         *
         * So, name2 and name3 refer to same String object and that
         * is why name2 == name3 returns true.
         */
        String name3 = "James" + "Gosling"; // SCP - JamesGosling

        System.out.println(name1 == name2); // false
        System.out.println(name2 == name3); // true
    }
}
