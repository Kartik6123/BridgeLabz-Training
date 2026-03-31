public class PasswordValidator {
    // Interface with static method
    interface SecurityUtils {

        static boolean isStrongPassword(String password) {
            // Rule: min 8 chars, one digit, one uppercase
            if (password.length() < 8) return false;

            boolean hasUpper = false;
            boolean hasDigit = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                if (Character.isDigit(ch)) hasDigit = true;
            }
            return hasUpper && hasDigit;
        }
    }

    public static void main(String[] args) {

        String password = "Insurance9";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
