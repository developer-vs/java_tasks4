package stringbuffer;

public class Delete2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        System.out.println(sb.capacity()); // 12
        sb.delete(8, 1000);
        System.out.println(sb); // 01234567

        /**
         *
         * `new StringBuilder(5);` creates a StringBuilder instance,
         * with capacity 5
         * `sb.append("0123456789");` successfully appends "0123456789"
         * to the StringBuilder's instance.
         * New capacity is: (5 * 2) + 2; = 12
         *
         * delete method accepts 2 parameters: delete(int start, int end),
         * where start is inclusive and end is exclusive.
         *
         * This method throws StringIndexOutOfBoundsException for following scenarios:
         * A. start is negative
         * B. start is greater than sb.length()
         * C. start is greater than end
         *
         * If end is greater than the length of StringBuilder object,
         * then StringIndexOutOfBoundsException is not thrown and end
         * is set to sb.length().
         *
         * So, in this case, `sb.delete(8, 1000);` is equivalent to
         * `sb.delete(8, sb.length());`
         *
         * This deletes characters at index (8) to index (9).
         * So remaining characters are: "01234567".
         *
         * StringBuilder class overrides toString() method,
         * which prints the text stored in StringBuilder instance.
         * Hence, `System.out.println(sb);` prints 01234567 on to the console.
         */
    }
}
