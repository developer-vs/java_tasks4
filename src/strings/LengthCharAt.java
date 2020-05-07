package strings;

public class LengthCharAt {

    public static void main(String[] args) {
        /**
         * String class has length() method,
         * which returns number of characters in the String.
         * So length() method returns 11.
         *
         * String class has charAt(int index) method,
         * which returns character at passed index.
         * str.charAt(10) looks for character at index 10.
         * index starts with 0. ! sign is at index 10.
         */
        String str = "Java Rocks!";
        System.out.println(str.length() + " : " + str.charAt(10));
    }
}
