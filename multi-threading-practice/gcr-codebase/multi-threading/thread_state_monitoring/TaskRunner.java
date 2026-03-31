package thread_state_monitoring;

class TaskRunner extends Thread {
    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Math.pow(i, 2); // simple computation
                Thread.sleep(500); // simulate work
            }

            Thread.sleep(2000); // sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
    }
}

