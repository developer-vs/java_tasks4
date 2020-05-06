package exceptons;

public class Example16 {

    public static void main(String[] args) {
        /**
         * If a method declares to throw Exception or its sub-type
         * other than RuntimeException types, then calling method
         * should follow handle or declare rule.
         *
         * In this case, as method m1() declares to throw Exception,
         * so main method should either declare the same exception or
         * its super type in its throws clause OR m1() should be surrounded by try-catch block.
         *
         * Line 3 in this case causes compilation error.
         */
//        m1(); //Line 3
    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
    }
}
