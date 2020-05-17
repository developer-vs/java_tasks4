package constructor;

class Student2 {
    String name;
    int age;

    /**
     * No-arg constructor of Student2 class calling
     * another overloaded constructor by the name
     * and this causes compilation error.
     * Student2("James", 25);
     *
     * This problem can be fixed in 2 ways:
     */

    Student2() {
        // Solution 1.
        // method can have same name as the class name
        // and constructor can call other methods.
        // Student2("James", 25); // call method

        // Solution 2.
        // replace Student2("James", 25);
        // with this("James", 25) OR 2nd one:
        this("James", 25); // call constructor
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method
    void Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Example2 {

    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println(s.name + ":" + s.age);
    }
}
