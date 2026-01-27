import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Age must be between 0 and 150.");
            }

            System.out.println("Your age is: " + age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
