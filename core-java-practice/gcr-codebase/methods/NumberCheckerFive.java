import java.util.Scanner;

public class NumberCheckerFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
    }
    // Method to calculate sum of proper divisors of a number
    static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check whether a number is Perfect
    static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check whether a number is Abundant
    static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check whether a number is Deficient
    static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to check whether a number is Strong
    static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to calculate factorial of a digit
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

