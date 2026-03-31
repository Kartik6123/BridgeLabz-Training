public class BackgroundJobExecution {
    public static void main(String[] args) {
        // Runnable functional interface
        Runnable backgroundTask = () -> {
            System.out.println("Background job started...");
            System.out.println("Processing data...");
            System.out.println("Background job completed!");
        };
        // Run asynchronously
        Thread thread = new Thread(backgroundTask);
        thread.start();
    }
}
