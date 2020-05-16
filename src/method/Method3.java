package method;

class Student3 {
    String name;  // null
    int age;      // 0

    /**
     * Methods can have same name as the class.
     * Student() and Student(String, int) are methods
     * and not constructors of the class,
     * note the void return type of these methods.
     */

    // method
    void Student3() {
        Student3("James", 25);
    }

    // method overloading
    void Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * As no constructors are provided in the Student class,
     * java compiler adds default no-arg constructor.
     * That is why the statement Student s = new Student()
     * doesn't give any compilation error.
     *
     * Default values are assigned to instance variables,
     * hence null is assigned to name and 0 is assigned to age.
     */
}

public class Method3 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.name + ":" + s.age); // null:0
    }
}
