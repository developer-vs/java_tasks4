package local;

public class LocalVariable {

    public static void main(String[] args) {
        double age = 5.7;
        String color;
        int weight;
        if(age < 7) {
            color = "green";
            weight = 3;
        }
        // System.out.println(color); // compiler error -> Variable 'color' might not have been initialized
        // System.out.println(weight); // compiler error -> Variable 'weight' might not have been initialized
    }
}
