package exceptons;

public class Example13 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try {
            /**
             * for(;;) is an infinite loop and hence 'sb.append("OCA")'zxao
             * causes OutOfMemoryError which is a subclass of Error class.
             *
             * main(String []) method throws OutOfMemoryError and
             * program terminates abruptly.
             */
            for(;;) {
                sb.append("OCA");
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}
