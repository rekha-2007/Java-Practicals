
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Single Inheritance
class Car extends Vehicle {
    String model = "Fortuner";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Multilevel Inheritance
class Person {
    String name = "Rahul";

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showManager() {
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println("Area of Circle: "
                + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void calculateArea() {
        System.out.println("Area of Rectangle: "
                + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Single Inheritance ===");
        Car c = new Car();
        c.start();
        c.display();

        System.out.println("\n=== Multilevel Inheritance ===");
        Manager m = new Manager();
        m.showName();
        m.showEmployee();
        m.showManager();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        cir.display();
        cir.calculateArea();

        rect.display();
        rect.calculateArea();
    }
}
