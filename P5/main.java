
class ComplexNumber {
    double real;
    double imaginary;

    // Constructor
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber c) {
        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    // Method to display a complex number
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(5, 6);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.print("Sum of Complex Numbers: ");
        result.display();
    }
}

