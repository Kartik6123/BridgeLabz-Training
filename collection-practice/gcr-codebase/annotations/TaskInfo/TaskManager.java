import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}
public class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Kartik")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
