package stringbuffer;

public class ImportantMethods {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        // length()
        System.out.println(sb1.length()); // 0
        // capacity
        System.out.println(sb1.capacity()); // 16

        StringBuffer sb2 = new StringBuffer("Java");
        // charAt()
        System.out.println(sb2.charAt(2)); // v
        // setCharAt()
        sb2.setCharAt(0, 'Y' );
        System.out.println(sb2); // Yava

        // append()
        sb1.append("PI value is ");
        sb1.append("3.14");
        sb1.append(" , it is exactly ");
        sb1.append("true");
        System.out.println(sb1); // PI value is 3.14 , it is exactly true

        // append() with null
        // StringBuilder sb1a = new StringBuilder();
        // System.out.println(sb1a.append(null).length()); // compilation error
        /**
         * 'append' method is overloaded in StringBuilder class:
         * append(String), append(StringBuffer) and append(char[]) etc.
         *
         * In this case compiler gets confused as to which method
         * `append(null)` can be tagged because String, StringBuffer and char[]
         * are not related to each other in multilevel inheritance.
         * Hence `sb.append(null)` causes compilation error.
         */

        // initialize the StringBuffer object
        StringBuilder sb = new StringBuilder("java");
        System.out.println("Contents of buffer:" + sb); // Contents of buffer:java
        System.out.println("Old Capacity:" + sb.capacity()); // 16 + 4 - Old Capacity:20
        // increase the capacity
        sb.ensureCapacity(21);
        System.out.println("New Capacity:" + sb.capacity()); // New Capacity:42
        /*
            The length of the string is 4. With the initial capacity of
            the buffer to be 16, the capacity is now 20.
            And then we have called the ensureCapacity method with
            argument value of 21, since the rule is if the argument is
            more than the current capacity, the capacity becomes twice
            the current capacity plus 2.
            The capacity is now (20 * 2 ) + 2 = 42.
         */

        StringBuffer sb3 = new StringBuffer("abcdefgh");
        sb3.insert(2, "xyz");
        System.out.println(sb3); // abxyzcdefgh

        StringBuffer sb4 = new StringBuffer("abcdefgh");
        sb4.insert(2, true);
        System.out.println(sb4); // abtruecdefgh

        StringBuffer sb5 = new StringBuffer("abcdefgh");
        // from begin index to end-1 index
        sb5.delete(0, 2);
        System.out.println(sb5); // cdefgh

        StringBuffer sb6 = new StringBuffer("Java");
        sb6.deleteCharAt(2);
        System.out.println(sb6); // Jaa

        StringBuffer sb7 = new StringBuffer("Java");
        sb7.reverse();
        System.out.println(sb7); // avaJ

        StringBuffer sb8 = new StringBuffer("Java"); // capacity = 20
        sb8.setLength(2);
        System.out.println(sb8); // Ja
        System.out.println(sb8.capacity()); // 20
        sb8.trimToSize();
        System.out.println(sb8.capacity()); // 2
    }
}
