package method;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Method1 {

    public static void main(String[] args) {
        Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks); // 25-60
    }

    private static void review(Student stud, int marks) { // {"James", 25}
        marks = marks + 10;
        System.out.println(marks); // 35
        stud.marks += marks;    // 25 + 35 = 60
    }

    /**
     * check your knowledge of pass-by-value
     * and pass-by-reference schemes.

     * marks<review> = 25 (this marks is different from the marks defined in main method).
     * marks<review> = 35 and stud.marks = 60.
     * So at the end of review method: stud<review> --> {"James", 60}, marks<review> = 35.
     *
     * Control goes back to main method: student<main> --> {"James", 60}, marks<main> = 25.
     * Changes done to reference variable are visible in main method
     * but changes done to primitive variable are not reflected in main method
     */
}
