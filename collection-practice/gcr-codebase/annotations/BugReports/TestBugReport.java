import java.lang.reflect.*;

public class TestBugReport {
    public static void main(String[] args) throws Exception {

        Class<TaskService> c = TaskService.class;
        Method m = c.getDeclaredMethod("processTask");

        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);

        for (BugReport b : bugs) {
            System.out.println("Bug: " + b.description());
        }
    }
}
