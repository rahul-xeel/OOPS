
public class Code {

    static String schoolName = "MIET College";
    static int totalStudents = 1200;

    // Methods
    static void displaySchoolInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
    }

    static int calculateAverage(int totalMarks, int subjects) {
        return totalMarks / subjects;
    }

    // Main method
    public static void main(String[] args) {

        // Calling static methods directly without creating an object
        
        displaySchoolInfo();

        int avg = calculateAverage(450, 5);
        System.out.println("Average Marks: " + avg);
    }
}
