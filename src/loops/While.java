package loops;

public class While {

        public static void main(String[] args) {
            int x = 1;
            while(checkAndIncrement(x)) { // Infinite loop, "x" is always 1
                System.out.println(x);
            }
        }

        private static boolean checkAndIncrement(int x) {
            if(x < 5) {
                x++;
                return true;
            } else {
                return false;
            }
        }

}
