import java.util.*;

public class CourseUtil {

	public static void displayCourses(ArrayList<? extends CourseType> courses) {
        for (CourseType courseType : courses) {
            System.out.println("Evaluation: " + courseType.getEvaluationType());
        }
    }

}