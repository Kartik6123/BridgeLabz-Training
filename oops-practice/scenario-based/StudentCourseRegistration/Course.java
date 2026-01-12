package StudentCourseRegistration;
class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException(String message) {
        super(message);
    }
}
public class Course {
    String courseName;
    int courseId;
    int courseFee;
    StudentRegistration student;
    Course(String courseName, int id, int fee,StudentRegistration student) throws CourseLimitExceededException {
         this.courseName = courseName;
            this.courseId = id;
            this.courseFee = fee;
            this.student = student;
          if(student.courseCount >= 5) {
                throw new CourseLimitExceededException("Cannot register more than 5 courses for student: " + student.studentName);
            }
            student.registeredCourses[student.courseCount] = courseName;
            student.courseCount++;
    }

}
