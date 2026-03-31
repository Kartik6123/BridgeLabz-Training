import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (number <= 0 || power <= 0) {
            // Validate positive integers
            System.out.println("Please enter positive integers only");
        } else {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                // Calculate power using loop
                result = result * number;
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
    }
}
