package stringbuffer;

public class ImportantMethods {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        // length()
        System.out.println(sb1.length());
        // capacity
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Java");
        // charAt()
        System.out.println(sb2.charAt(2));
        // setCharAt()
        sb2.setCharAt(0, 'Y' );
        System.out.println(sb2);

        // append()
        sb1.append("PI value is ");
        sb1.append("3.14");
        sb1.append(" , it is exactly ");
        sb1.append("true");
        System.out.println(sb1);

        // initialize the StringBuffer object
        StringBuilder sb = new StringBuilder("java");
        System.out.println("Contents of buffer:" + sb);
        System.out.println("Old Capacity:" + sb.capacity()); // 16 + 4
        // increase the capacity
        sb.ensureCapacity(21);
        System.out.println("New Capacity:" + sb.capacity());
        /*
            The length of the string is 4. With the initial capacity of
            the buffer to be 16, the capacity is now 20.
            And then we have called the ensureCapacity method with
            argument value of 21, since the rule is if the argument is
            more than the current capacity, the capacity becomes twice
            the current capacity plus 2.
            The capacity is now (20 * 2 ) + 2 = 42.
         */
    }
}
