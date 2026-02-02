import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)   // container
@interface BugReport {
    String description();
}

class TaskService {

    @BugReport(description = "Null pointer on edge case")
    @BugReport(description = "Slow for large input")
    public void processTask() {
        System.out.println("Processing task");
    }
}
