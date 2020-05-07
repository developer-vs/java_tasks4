package strings;

public class AssignmentOperator {

    public static void main(String[] args) {
        String fName = "James";
        String lName = "Gosling";

        /**
         * In System.out.println() statement, we have used
         * assignment operator (=) and not equality operator (==)
         *
         * fName = lName means copy the contents of lName to fName.
         */
        System.out.println(fName = lName); // Gosling
    }
}
