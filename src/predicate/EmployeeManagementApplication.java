package predicate;

import java.util.ArrayList;

class Employee {
    String name;
    String designation;
    double salary;
    String city;

    Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }
}
public class EmployeeManagementApplication {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add(new Employee("Tom", "CEO", 100000, "Seattle"));
    }
}
