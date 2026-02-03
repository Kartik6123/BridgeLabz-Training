class BackupTask implements Comparable<BackupTask> {
    String path;
    int priority;

    BackupTask(String path, int priority) throws InvalidBackupPathException {
        if (path == null || path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        this.path = path;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask o) {
        return o.priority - this.priority; // Higher priority first
    }
}
