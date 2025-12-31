package contructors;
public class Student {
    public int rollNumber;
    public String name;
    private double Cgpa;

    Student() {
        // default constructor
        this.rollNumber = 0;
        this.name = "Unknown";
        this.Cgpa = 0.0;
    }
    Student(int rollNumber, String name, double Cgpa) {
        // parameterized constructor
        this.rollNumber = rollNumber;
        this.name = name;
        this.Cgpa = Cgpa;
    }
    double getCgpa() {
        // getter method
        return this.Cgpa;
    }
    double setCgpa(double newCgpa) {
        //  setter method
        if(newCgpa < 0.0 || newCgpa > 10.0) {
            System.out.println("Invalid Cgpa value. It should be between 0.0 and 10.0.Old Cgpa retained.");
            return this.Cgpa;
        }
        this.Cgpa = newCgpa;
        return this.Cgpa;
    }
    void display(){
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Cgpa: " + this.Cgpa);
    }
}
    class PostGraduate extends Student{
        // subclass
        String specialization;
        PostGraduate(){
            super();
            this.specialization = "";
        }
        PostGraduate(int rollNumber, String name, double Cgpa, String specialization){
            super(rollNumber, name, Cgpa);
            this.specialization = specialization;
        }
        void display(){
            super.display();
            System.out.println("Specialization: " + this.specialization);
        }
    }
     class Main{
        public static void main(String[] args) {
            Student student = new Student(1, "John Doe", 8.5);
            student.display();
            PostGraduate pgStudent = new PostGraduate(101, "Alice", 9.1, "Computer Science");
            pgStudent.display();
            student.setCgpa(11.0); // Invalid Cgpa
            System.out.println("Updated Cgpa: " + student.getCgpa());
        }
     }
