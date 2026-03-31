package print_shop;

public class PrintShopScheduler {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting print jobs...");
        PrintJob job1 = new PrintJob("Job1", 10, 5);
        PrintJob job2 = new PrintJob("Job2", 5, 8);
        PrintJob job3 = new PrintJob("Job3", 15, 3);
        PrintJob job4 = new PrintJob("Job4", 8, 6);
        PrintJob job5 = new PrintJob("Job5", 12, 7);

        // wrap jobs in threads
        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);
        Thread t4 = new Thread(job4);
        Thread t5 = new Thread(job5);

        // Set thread priorities 
        t1.setPriority(job1.getPriorityLevel());
        t2.setPriority(job2.getPriorityLevel());
        t3.setPriority(job3.getPriorityLevel());
        t4.setPriority(job4.getPriorityLevel());
        t5.setPriority(job5.getPriorityLevel());

        // track start time
        long startTime = System.currentTimeMillis();

        // Start all print jobs concurrently
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all jobs to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        long endTime = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (endTime - startTime) + "ms");
    }
}
