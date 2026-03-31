import java.util.*;

class BackupScheduler {
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    void addTask(BackupTask task) {
        queue.add(task);
    }

    void executeTasks() {
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Backing up: " + task.path +
                               " | Priority: " + task.priority);
        }
    }
}
