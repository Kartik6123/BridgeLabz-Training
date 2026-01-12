package StudentCourseRegistration;

public class StudentRegistration {
    String studentName;
    int studentId;
     int courseCount;
    String[] registeredCourses = new String[5];
    StudentRegistration(String name, int id) {
        this.studentName = name;
        this.studentId = id;
        this.courseCount = 0;
    }
}
