package exceptons;

public class Example8 {

    private static String s;

    public static void main(String[] args) {
         // try {
         //   System.out.println(s.length());
            /**
             * NullPointerException extends RuntimeException
             * and in multi-catch syntax we can't specify
             * multiple Exceptions related to each other in
             * multilevel inheritance.
             */
         // } catch(NullPointerException | RuntimeException ex) {
         //   System.out.println("DONE");
         //}
    }
}
