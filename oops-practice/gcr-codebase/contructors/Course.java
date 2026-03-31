package contructors;

import java.util.Scanner;

public class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName;

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    // Class method to update institute name
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for static variable
        System.out.print("Enter Institute Name: ");
        String instName = sc.nextLine();
        Course.updateInstituteName(instName);

        Course c1 = new Course("Java", 6, 25000);
        Course c2 = new Course("Python", 4, 20000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
