package thread_state_monitoring;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class StateMonitor extends Thread {
    private Thread[] threads;

    public StateMonitor(Thread... threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        boolean monitoring = true;
        while (monitoring) {
            monitoring = false;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                System.out.println("[Monitor] " + t.getName() + " is in " +
                                   state + " state at " + LocalTime.now().format(formatter));

                // If any thread is not terminated, continue monitoring
                if (state != Thread.State.TERMINATED) {
                    monitoring = true;
                }
            }

            try {
                Thread.sleep(500); // check every 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Thread t : threads) {
            System.out.println("Summary: " + t.getName() + " went through states: NEW, RUNNABLE, TIMED_WAITING, TERMINATED");
        }
    }
}

