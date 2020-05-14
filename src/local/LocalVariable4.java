package local;

public class LocalVariable4 {
    static String msg; //Line 2
    public static void main(String[] args) {
        String msg; //Line 4
        if(args.length > 0) {
            msg = args[0]; //Line 6
        }
        /*
            Line 4 code shadows the variable at Line 2.
            msg variable created at Line 4 is a local variable
            and should be initialized before it is used.

            Initialization code is inside if-block, so compiler
            is not sure about msg variable's initialization.

            Hence, Line 8 causes compilation failure.
         */
        // System.out.println(msg); //Line 8
    }
}
