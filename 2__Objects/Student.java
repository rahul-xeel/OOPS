public class Student {
    
    // Fields (variables)
    private String name;       // private: can be accessed only within this class
    private int rollNumber;
    
    public static String schoolName = "MIET College"; // static: shared among all instances
    
    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Methods (functions)
    public void displayInfo() {   // public method: accessible from other classes
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("School: " + schoolName);
    }

    public static void displaySchool() { // static method
        System.out.println("School Name: " + schoolName);
    }
}



class TestStudent {

    public static void main(String[] args) {
        
        // Demonstrating multiple objects
        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Kumar", 102);

        // Using non-static method
        s1.displayInfo();
        System.out.println("-------------------");
        s2.displayInfo();

        // Using static method
        System.out.println("-------------------");
        Student.displaySchool();

        // Changing static variable
        Student.schoolName = "New MIET Campus";
        System.out.println("-------------------");
        Student.displaySchool();
    }
}
