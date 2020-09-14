package method;

public class Method5 {

    private int myValue = 0;

    public void showOne(int myValue){
        myValue = myValue;
        /*
            Therefore, when you do : myValue = myValue; you are actually
            assigning the value contained in method parameter myValue to itself.
            You are not changing the member field myValue.
            Hence, when you do System.out.println(ct); in the next line, it prints 0.

            If you declare a local variable with the same name as the instance field name,
            the local variable "shadows" the member field.
         */
    }

    public void showTwo(int myValue){
        this.myValue = myValue;
        /*
            Therefore, when you access this.myValue, you are accessing the
            instance member myValue of the Method5 instance.
         */
    }
    public static void main(String[] args) {
        Method5 ct = new Method5();
        ct.showOne(100);
        System.out.println(ct.myValue);
        ct.showTwo(200);
        System.out.println(ct.myValue);
    }
}
