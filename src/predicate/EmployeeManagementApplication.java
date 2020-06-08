package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

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

    @Override
    public String toString() {
        String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
        return s;
    }

    @Override
    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return name.equals(e.name) &&
                designation.equals(e.designation) &&
                salary == e.salary &&
                city.equals(e.city);
    }
}

public class EmployeeManagementApplication {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("Tom", "CEO", 100_000, "Lakewood");
        Employee e2 = new Employee("Bob", "Manager", 80_000, "Seattle");
        Employee e3 = new Employee("Sang", "Manager", 95_000, "Bellevue");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        populate(employeeList);

        System.out.println("\nShow all employees:");
        System.out.println(employeeList);

        Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
        Predicate<Employee> p2 = emp -> emp.designation.equals("Developer");
        System.out.println("\nShow all managers information:");
        display(p1, employeeList);
        System.out.println("\nShow all developers information:");
        display(p2, employeeList);
        Predicate<Employee> p3 = emp -> emp.city.equals("Seattle");
        System.out.println("\nShow all employees from Seattle:");
        display(p3, employeeList);
        System.out.println("\nShow all developers from Seattle:");
        display(p2.and(p3), employeeList);
        System.out.println("\nShow all developers or managers from Seattle:");
        display(p1.or(p2).and(p3), employeeList);
        System.out.println("\nShow all employees who are not managers");
        display(p1.negate(), employeeList);

        Predicate<String> p = Predicate.isEqual("Software"); // isEqual() -> static method
        System.out.println(p.test("Software")); // true

        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Tom", "CEO", 100_000, "Lakewood"));
        System.out.println(isCEO.test(e1)); // true
        System.out.println(isCEO.test(e2)); // false
    }

    public static void populate(ArrayList<Employee> employeeArrayList) {
        employeeArrayList.add(new Employee("Mike", "Developer", 75_000, "Seattle"));
        employeeArrayList.add(new Employee("Tony", "Developer", 78_000, "Tacoma"));
    }

    public static void display(Predicate<Employee> p, ArrayList<Employee> employeeList) {
        for (Employee e : employeeList) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }
}
