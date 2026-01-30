package UnitTesting.UnitTesting;

public class TaskService {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // sleep for 3 seconds
        return "Task Completed";
    }
}
