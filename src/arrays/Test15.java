package arrays;


import java.util.ArrayList;
import java.util.List;

public class Test15 {
    static abstract class Animal {}
    static class Dog extends Animal{}

    /**
     * List is super type and ArrayList is sub type,
     * hence List l = new ArrayList(); is valid syntax.
     *
     * Animal is super type and Dog is sub type,
     * hence Animal a = new Dog(); is valid syntax.
     * Both depicts Polymorphism.
     *
     * But in generics syntax, Parameterized types
     * are not polymorphic, this means ArrayList<Animal>
     * is not super type of ArrayList<Dog>.
     * Remember this point.
     *
     * So below syntaxes are not allowed:
     * ArrayList<Animal> list = new ArrayList<Dog>();
     * OR
     * List<Animal> list = new ArrayList<Dog>();
     */
    public static void main(String [] args) {
//        List<Animal> list = new ArrayList<Dog>(); // CE
//        list.add(0, new Dog());
//        System.out.println(list.size() > 0);
    }
}
