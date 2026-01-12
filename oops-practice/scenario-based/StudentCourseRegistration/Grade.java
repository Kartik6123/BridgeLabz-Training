package StudentCourseRegistration;

public class Grade {
    String grade;
    int marks;
    Grade(int marks) {
        this.marks = marks;
    }
    void assignGrade(int marks) {
        if (marks >= 90) {
            this.grade = "A";
        } else if (marks >= 80) {
            this.grade = "B";
        } else if (marks >= 70) {
            this.grade = "C";
        } else if (marks >= 60) {
            this.grade = "D";
        } else {
            this.grade                                                                                                                                                                                                                                                                     = "F";
        }
        this.marks = marks;
    }
}
