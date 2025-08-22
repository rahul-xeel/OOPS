// Compile-time polymorphism (Method Overloading)
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

// Run-time polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow! Meow!");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {

        // Compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
        System.out.println(calc.add(5.5, 4.5));

        System.out.println();

        // Run-time polymorphism
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
