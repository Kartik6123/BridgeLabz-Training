import java.util.*;

class BackupScheduler {

    PriorityQueue<BackupTask> pq = new PriorityQueue<>();

    void addTask(String path, int priority)
            throws InvalidBackupPathException {

        if (path == null || path.isEmpty())
            throw new InvalidBackupPathException("Invalid backup path");

        pq.add(new BackupTask(path, priority));
    }

    void executeBackups() {
        while (!pq.isEmpty()) {
            BackupTask task = pq.poll();
            System.out.println("Backing up: " + task.path +
                               " with priority " + task.priority);
        }
    }
}
