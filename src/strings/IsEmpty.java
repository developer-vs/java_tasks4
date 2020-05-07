package strings;

public class IsEmpty {

    public static void main(String[] args) {
        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1); // false

        str1.trim();
        b1 = str1.isEmpty();
        System.out.println(b1); // false
    }

    /**
     * str1 refers to single space character and isEmpty() method
     * of String returns true if no characters are there in the String.
     * As str1 contains single space, hence b1 is false.
     *
     * false is first printed on to the console.
     *
     * str1.trim(); => creates an empty string "" but str1 still refers
     * to single space string " ".
     *
     * b1 = str1.isEmpty(); assigns false to b1 and last
     * System.out.println statement prints false on to the console.
     */
}
