abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // abstract method (no body)
    abstract void start();

    // regular method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete subclass
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    // implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " car is starting with key ignition.");
    }
}

class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " bike is starting with kick start.");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Honda");

        v1.displayBrand();
        v1.start();

        v2.displayBrand();
        v2.start();
    }
}
