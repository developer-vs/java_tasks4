package exceptons;

public class Example2 {

    // Variable arr is a class variable of int [] type,
    // so by default it is initialized to null.
    private static int [] arr;

    public static void main(String [] args) {
        // Accessing length property on null reference
        // throws NullPointerException.

        // Correct logical if block declaration should be:
        // if(arr != null && arr.length > 0)
        if(arr.length > 0 && arr != null) {
            System.out.println(arr[0]);
        }
    }
}
