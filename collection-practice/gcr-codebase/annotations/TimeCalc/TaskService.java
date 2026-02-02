public class TaskService {

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 1_000_000; i++);
    }

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 100_000; i++);
    }

    public void normalTask() {
        System.out.println("No timing needed");
    }
}
