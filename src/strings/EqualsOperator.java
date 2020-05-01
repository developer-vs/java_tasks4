package strings;

public class EqualsOperator {

    public static void main(String[] args) {
        String s1 = new String("Software");
        String s2 = new String("Software");
        
        // == - reference operator
        // == - two objects are compared
        System.out.println(s1 == s2);

        // equals() is overridden from Object class for content comparison
        // sequence of characters are compared
        System.out.println(s1.equals(s2));

        StringBuffer s3 = new StringBuffer("Software");
        StringBuffer s4 = new StringBuffer("Software");

        // == - reference operator
        // == - two objects are compared
        System.out.println(s3 == s4);

        // equals() - reference operator
        // equals() - two objects are compared, not overridden from Object class
        System.out.println(s3.equals(s4));


    }
}
