package loops;

public class Continue2 {

    public static void main(String[] args) {
        /**
         * break; and continue; are used inside for-loop,
         * hence no compilation error.
         *
         * In first iteration "apple " is printed on to the console.
         * Cursor remains on the same line as print method is used and not println.
         *
         * boolean expression of if-block returns false,
         * control goes just after if-block and appends "salad!" on to the console.
         *
         * break; statement takes the control out of for loop,
         * main method ends and program terminates successfully.
         *
         * So in the console, you get "apple salad!"
         */
//        String [] fruits = {"mango", "orange"};
        String [] fruits = {"apple", "banana", "mango", "orange"};
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
            // if true -> for(String fruit : fruits)
            // if false -> System.out.println("salad!")
            if(fruit.equals("mango")) {
                continue;
            }
            System.out.println("salad!");
            break;
        }
    }
}
