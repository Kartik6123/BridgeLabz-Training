package StudentCourseRegistration;

public class PrintDetails {
    Course course;
    StudentRegistration student;
    Grade grade;
    PrintDetails(Course course, StudentRegistration student, Grade grade) {
        this.course = course;
        this.student = student;
        this.grade = grade;
    }
    void displayDetails() {
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Course ID: " + course.courseId);
        System.out.println("Course Fee: " + course.courseFee);
        System.out.println("Marks: " + grade.marks);
        System.out.println("Grade: " + grade.grade);
    }
}
