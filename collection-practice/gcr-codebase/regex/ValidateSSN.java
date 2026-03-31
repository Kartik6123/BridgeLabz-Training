public class ValidateSSN {
    public static void main(String[] args) {

        String ssn = "123-45-6789";

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if (ssn.matches(regex)) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }
    }
}
