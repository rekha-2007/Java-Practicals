
class Employee {

    String name;
    double salary;

    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 30000);

        Employee e3 = new Employee("Aman", 40000);

        System.out.println("Employee Details:");

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount();
    }
}

