import java.io.Serializable;
public class BackupSerialization {
    static class UserData implements Serializable {
        String username;
        int age;

        UserData(String username, int age) {
            this.username = username;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        UserData user = new UserData("Sachin", 25);
        System.out.println("User marked Serializable for backup");
    }
}
