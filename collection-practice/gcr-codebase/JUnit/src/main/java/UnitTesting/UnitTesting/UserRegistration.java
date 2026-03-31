package UnitTesting.UnitTesting;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.length() < 3) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid password");
        }

        // Assume user registration is successful
        return true;
    }
}
