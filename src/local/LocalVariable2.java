package local;

public class LocalVariable2 {

    public static void main(String[] args) {
        double price = 90000;
        String model;
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        // Usage of LOCAL variable, 'model' without initialization
        // gives compilation error.
        // Hence, System.out.println(model); causes compilation error.

        // System.out.println(model);
    }
}
