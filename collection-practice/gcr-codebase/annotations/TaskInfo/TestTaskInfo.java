import java.lang.reflect.*;

public class TestTaskInfo {
    public static void main(String[] args) throws Exception {

        Class<TaskManager> c = TaskManager.class;

        Method m = c.getDeclaredMethod("completeTask");

        TaskInfo info = m.getAnnotation(TaskInfo.class);

        if (info != null) {
            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }
    }
}
