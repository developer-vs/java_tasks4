package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Student[" + name + ", " + age + "]";
        }

        /**
         * equals(Object) method has NOT been overridden
         * by the Student class.
         * In fact, equals(Student) is overloaded.
         * But overloaded version is not invoked while
         * equating the Student objects.
         */
        public boolean equals(Student obj) {
            if(obj instanceof Student) {
                Student stud = (Student)obj;
                if(this.name.equals(stud.name) && this.age == stud.age) {
                    System.out.println("false");
                    return true;
                }
            }
            System.out.println("true");
            return false;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        /**
         * equals(Object) method defined in Object class is
         * invoked and equals(Object) method defined in
         * Object class uses == operator to check the equality
         * and in this case as all the Student objects are stored
         * at different memory location, hence not equal.
         */
        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
    }
}
