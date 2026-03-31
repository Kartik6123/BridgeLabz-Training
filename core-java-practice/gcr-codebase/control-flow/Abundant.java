import java.util.Scanner;
public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sumOfDivisors = 0;
        for (int i = 1; i <= number / 2; i++) {
            // Calculate sum of proper divisors
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        if (sumOfDivisors > number) {
            // Check if number is abundant
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
    }
}
