
class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {
    double calculatePay() {
        return 20000;
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 50000;
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 15000;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Method Overloading ===");

        Calculator c = new Calculator();

        System.out.println("Sum of two integers: " + c.add(10, 20));
        System.out.println("Sum of three integers: " + c.add(10, 20, 30));
        System.out.println("Sum of two decimals: " + c.add(5.5, 4.5));

        System.out.println("\n=== Method Overriding ===");

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time employee pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time employee pay: " + e.calculatePay());
    }
}

