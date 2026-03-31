
import java.util.*;

public class UniversityApp {

	public static void main(String[] args) {
		Course<ExamCourse> math =new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs =new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =new Course<>("AI Research", new ResearchCourse());

        ArrayList<CourseType> examList = new ArrayList<>();
        examList.add(math.getCourseType());

        ArrayList<CourseType> assignmentList = new ArrayList<>();
        assignmentList.add(cs.getCourseType());

        ArrayList<CourseType> researchList = new ArrayList<>();
        researchList.add(phd.getCourseType());

        System.out.println("--- Exam Courses ---");
        CourseUtil.displayCourses(examList);

        System.out.println("\n--- Assignment Courses ---");
        CourseUtil.displayCourses(assignmentList);

        System.out.println("\n--- Research Courses ---");
        CourseUtil.displayCourses(researchList);

	}

}