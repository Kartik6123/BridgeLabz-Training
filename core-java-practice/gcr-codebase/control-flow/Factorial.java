import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
             // Calculate factorial using while loop
            int factorial = 1;
            int i = 1;
            while (i <= number) {
                // Multiply to get factorial
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial is: " + factorial);
        }
    }
}

