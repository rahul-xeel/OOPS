// Parent class
class Vehicle {
    String brand = "Generic Vehicle";

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

// Child class inherits from Vehicle
class Car extends Vehicle {
    String modelName = "Sedan";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
    }
}

// Another child class
class Bike extends Vehicle {
    String type = "Sport";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.honk(); // inherited method
        car.display();

        System.out.println();

        Bike bike = new Bike();
        bike.honk(); // inherited method
        bike.display();
    }
}
