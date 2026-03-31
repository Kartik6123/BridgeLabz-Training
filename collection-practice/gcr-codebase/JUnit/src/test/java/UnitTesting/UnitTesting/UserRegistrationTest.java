package UnitTesting.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertTrue(registration.registerUser(
                "ankit",
                "ankit@gmail.com",
                "Password1"
        ));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "ab",
                    "test@gmail.com",
                    "Password1"
            );
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "ankit",
                    "ankitgmail.com",
                    "Password1"
            );
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    "ankit",
                    "ankit@gmail.com",
                    "pass"
            );
        });
    }

    @Test
    void testNullValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(
                    null,
                    null,
                    null
            );
        });
    }
}
