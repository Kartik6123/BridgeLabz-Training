package classandobject;
class Student {
    String name;
    String rollNumber;
    double mark1;
    double mark2;
    double mark3;
    
    void calculateGrade() {
          // Method to calculate grade
        double avg = (mark1 + mark2 + mark3) / 3;
        if (avg >= 75) {
            System.out.println("Grade B");
        } else if (avg >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }

    void displayDetails() {
            // Method to display student details
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        calculateGrade();
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating Student object and initializing details
        Student s1 = new Student();
        s1.name = "Thamarai";
        s1.rollNumber = "ECE001";
        s1.mark1 = 80.0;
        s1.mark2 = 70.0;
        s1.mark3 = 75.0;
        s1.displayDetails();
    }
}

