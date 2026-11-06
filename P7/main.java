
class Demo {

    Demo() {
        System.out.println("Object Created");
    }

    void display() {
        System.out.println("Object is being used");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage Collector called");
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();

        obj = null;

        System.out.println("Object reference removed");

        System.gc();

        System.out.println("End of Main Method");
    }
}

