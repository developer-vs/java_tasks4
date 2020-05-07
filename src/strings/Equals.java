package strings;

public class Equals {

    public static void main(String[] args) {
        String s1 = "OcA";
        String s2 = "oCa";
        /**
         * equals(String str) method of String class matches
         * two String objects and it takes character's case
         * into account while matching.
         *
         * Alphabet A in upper case and alphabet a in lower case
         * are not equal according to this method.
         * As String objects referred by s1 and s2 have different cases,
         * hence output is false.
         */
        System.out.println(s1.equals(s2));
    }
}
