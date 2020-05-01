package strings;

public class ImmutableAndMutable {

    public static void main(String[] args) {

        // String objects are immutable
        // StringBuffer objects are mutable

        String s = new String("computer "); // s reference variable
        s.concat("software");                  // no reference variable
        System.out.println(s);

        StringBuffer sb = new StringBuffer("computer ");
        sb.append("software");
        System.out.println(sb);
    }
}
