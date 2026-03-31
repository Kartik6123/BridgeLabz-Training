class BackupTask implements Comparable<BackupTask> {

    String path;
    int priority;

    BackupTask(String path, int priority) {
        this.path = path;
        this.priority = priority;
    }

    public int compareTo(BackupTask b) {
        return b.priority - this.priority;
    }
}
