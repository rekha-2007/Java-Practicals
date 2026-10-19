
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Base class
class Machine {
    void start() {
        System.out.println("Machine is starting.");
    }
}

// Derived class inheriting Machine and implementing interfaces
class SmartPrinter extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("SmartPrinter is printing.");
    }

    public void scan() {
        System.out.println("SmartPrinter is scanning.");
    }

    void connectToWiFi() {
        System.out.println("SmartPrinter connected to WiFi.");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Multiple Inheritance ===");
        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        System.out.println("\n=== Hybrid Inheritance ===");
        SmartPrinter sp = new SmartPrinter();
        sp.start();
        sp.print();
        sp.scan();
        sp.connectToWiFi();
    }
}

