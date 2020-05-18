package constructor;

abstract class Animal {
    private String name;

    Animal(String name) {
        // super(); -> added by compiler,
        // it refers to no-arg constructor of Object class.
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;
/*
    Dog(String breed) {
        // super(); -> added by compiler.
        // No-arg constructor is not available in Animal class.
        // Hence this constructor gives compilation error.
        this.breed = breed;
    }
*/
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Example5 {
    public static void main(String[] args) {
        // Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        // System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
        //        dog2.getName() + ":" + dog2.getBreed());
    }
}
