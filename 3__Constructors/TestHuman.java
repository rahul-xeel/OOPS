class Human {
    String name;
    int age;
    String gender;

    // Default constructor
    Human() {
        this("Unknown", 0, "Unknown"); // Constructor chaining to parameterized constructor
    }

    // Parameterized constructor
    Human(String name, int age) {
        this(name, age, "Unknown"); // Constructor chaining to another parameterized constructor
    }

    // Parameterized constructor with all fields
    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Copy constructor
    Human(Human other) {
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
    }

    void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Gender: " + gender);
        System.out.println("----------------------");
    }
}

public class TestHuman {
    public static void main(String[] args) {

        // Using default constructor
        Human h1 = new Human();
        h1.displayInfo();

        // Using parameterized constructor (2 params)
        Human h2 = new Human("Kumar", 25);
        h2.displayInfo();

        // Using parameterized constructor (3 params)
        Human h3 = new Human("Rahul", 30, "Male");
        h3.displayInfo();

        // Using copy constructor
        Human h4 = new Human(h3);
        h4.displayInfo();
    }
}
