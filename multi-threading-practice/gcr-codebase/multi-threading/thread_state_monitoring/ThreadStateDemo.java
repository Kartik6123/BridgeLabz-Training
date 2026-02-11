package thread_state_monitoring;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);
        monitor.start();

        // Task threads are in NEW state
        Thread.sleep(500); // small delay

        task1.start();
        task2.start();

        // Wait for all threads to finish
        task1.join();
        task2.join();
        monitor.join();

        System.out.println("All tasks completed and monitoring stopped.");
    }
}

