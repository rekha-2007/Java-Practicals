
class Product {
    String name;
    double price;
    int quantity;

    // No-argument constructor
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor with product name
    Product(String name) {
        this.name = name;
        price = 0;
        quantity = 0;
    }

    // Constructor with name and price
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    // Constructor with all three fields
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 15000);
        Product p4 = new Product("Keyboard", 500, 3);

        System.out.println("No Argument Constructor:");
        p1.display();

        System.out.println("Name Constructor:");
        p2.display();

        System.out.println("Name and Price Constructor:");
        p3.display();

        System.out.println("All Arguments Constructor:");
        p4.display();
    }
}

