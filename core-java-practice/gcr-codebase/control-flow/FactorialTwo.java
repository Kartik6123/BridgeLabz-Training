import java.util.*;
public class FactorialTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
            int factorial = 1;
              // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                // Multiply to get factorial
                factorial = factorial * i;
            }
            System.out.println("Factorial is: " + factorial);
        }
    }
}

