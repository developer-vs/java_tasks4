package exceptons;

public class Example7 {

    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            /**
             * main() method neither provides catch handler nor
             * throws clause and hence main method causes Compilation error.
             *
             * Handle or Declare rule should be followed for checked exception
             * if you are not re-throwing it.
             */
//            m1();
        } finally {
            System.out.println("A");
        }
    }
}
