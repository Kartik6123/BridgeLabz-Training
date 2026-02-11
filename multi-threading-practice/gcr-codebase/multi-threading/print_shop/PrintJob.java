package print_shop;

class PrintJob implements Runnable {
    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        String priorityLabel = (priority >= 8) ? "High Priority" :   (priority >= 5) ? "Medium Priority" : "Low Priority";

        for (int i = 1; i <= pages; i++) {
            System.out.println("[" + priorityLabel + "] Printing " + jobName +   " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100); // simulate printing time per page
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        System.out.println(jobName + " completed.");
    }

    public int getPriorityLevel() {
        return priority;
    }
}

