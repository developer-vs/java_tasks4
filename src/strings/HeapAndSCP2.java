package strings;

public class HeapAndSCP2 {

    public static void main(String[] args) {
        // Two objects will be created:
        // one on a heap - "You can't change ME"
        // another one on a SCP - "You can't change ME"
        String s1 = new String("You can't change ME");

        // One object will be created:
        // one on a heap - "You can't change ME"
        // on a SCP already exist
        String s2 = new String("You can't change ME");
        System.out.println(s1 == s2); // false

        // on a SCP object already exist
        // and s3 will point on that object
        String s3 = "You can't change ME";
        System.out.println(s1 == s3); // false

        // on a SCP object already exist
        // and s3 will point on that object
        String s4 = "You can't change ME";
        System.out.println(s3 == s4); // true

        // we have two constants: "You can't " and "change ME"
        // at first, concatenation will be happen at compile time
        // at runtime we will have "You can't change ME"
        // on a SCP object already exist
        String s5 = "You can't " + "change ME";
        System.out.println(s4 == s5); // true

        // on a SCP will be crated object - "You can't "
        // on a SCP will be crated object - "change ME"
        // as we have one variable and one constant, than
        // concatenation operation will be available
        // at runtime only
        // one on a heap will be crated an object - "You can't change ME"
        String s6 = "You can't ";
        String s7 = s6 + "change ME";
        System.out.println(s4 == s7); // false

        // final means constant, s8 is a constant, we don't need
        // to create an object on a SCP - "You can't ",
        // because it's already exist.
        // s8 will be replaced by value at compile time
        // and concatenate with "change ME"
        // this is the same as s5
        // at runtime we will have only one single literal - "You can't change ME"
        // and save it on SCP,
        // as this object already exist new object will not created
        // and s9 will be pointed to that object
        final String s8 = "You can't ";
        String s9 = s8 + "change ME";
        System.out.println(s4 == s9); // true
    }
}
