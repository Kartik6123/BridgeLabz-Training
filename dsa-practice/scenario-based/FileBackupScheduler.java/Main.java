public class Main {
    public static <BackupScheduler> void main(String[] args) {

        BackupScheduler bs = new BackupScheduler();

        try {
            bs.addTask("C:/Important", 5);
            bs.addTask("D:/Photos", 2);
            bs.addTask("", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        bs.executeBackups();
    }
}
