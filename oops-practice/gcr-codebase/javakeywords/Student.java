package javakeywords;

public class Student {
    static String universityName;
    String studentName;
    final int rollNumber;
    char grade;
    static int totalStudents;
    static void displayTotalStudents() {
        // static method
        System.out.println("University: " + universityName + ", Total Students: " + totalStudents);
    }
    Student(String studentName, int rollNumber, char grade) {
        // constructor
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    void displayStudentDetails() {
        // instance method
        if(this instanceof Student){
            // using 'this' keyword
            System.out.println("Name: " + studentName + ", Roll Number: " + rollNumber + ", Grade: " + grade);
        }
    }
    public static void main(String[] args) {
        Student.universityName = "GLA University";
       

        Student student1 = new Student("John Doe", 201, 'A');
        Student student2 = new Student("Jane Smith", 202, 'B');
         Student.displayTotalStudents();
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
