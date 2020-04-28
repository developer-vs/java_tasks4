package strings;

public class Main {

    public static void main(String[] args) {

        // String objects are immutable
        // StringBuffer objects are mutable

        String s = new String("vlad "); // s reference variable
        s.concat("software");                  // no reference variable
        System.out.println(s);

        StringBuffer sb = new StringBuffer("vlad ");
        sb.append("software");
        System.out.println(sb);
    }
}
