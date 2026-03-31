public class UsernameValidation {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us"};

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
