package StudentCourseRegistration;

public class Main {
    public static void main(String[] args){
        try {
            StudentRegistration student = new StudentRegistration("Alice", 101);
            Course course1 = new Course("Mathematics", 201, 500,student);
            Grade grade1 = new Grade(95);
            PrintDetails details1 = new PrintDetails(course1, student, grade1);
            grade1.assignGrade(95);
            details1.displayDetails();

            Course course2 = new Course("Physics", 202, 600,student);
            grade1.assignGrade(88);
            PrintDetails details2=new PrintDetails(course2, student, grade1);
            details2.displayDetails();
            
            Course course3 = new Course("Chemistry", 203, 550,student);
            grade1.assignGrade(76);
            Course course4 = new Course("Biology", 204, 650,student);
            grade1.assignGrade(69);
            Course course5 = new Course("Computer Science", 205, 700,student);
            grade1.assignGrade(82);
            // Attempting to register a sixth course
            Course course6 = new Course("History", 206, 400,student);
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
