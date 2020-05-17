package constructor;

class Student {
    String name;
    int age;

    /**
     * A constructor can call another constructor by using
     * this(...) and not the constructor name.
     *
     * Hence Student("James", 25); gives compilation error.
     */
    Student() {
        // Student("James", 25);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}
