import java.util.Scanner;

public class NumberCheckerTwo {

    // Main method to take input and display all results
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = DigitCount(number);
        int[] digits = getDigits(number);
        // Calculating sum and sum of squares of digits
        int sum = sumOfDigits(digits);
        double sumOfSquares = sumOfSquaresOfDigits(digits);

        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);

        // Checking Harshad number
        System.out.println("Harshad Number: " + isHarshad(number, sum));

        // Finding digit frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " -> " + frequency[i][1]);
            }
        }
    }

    // Method to count number of digits in a number
    static int DigitCount(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to extract digits of a number into an array
    static int[] getDigits(int number) {
        int count = DigitCount(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check whether a number is Harshad number
    static boolean isHarshad(int number, int sum) {
        return number % sum == 0;
    }

    // Method to calculate frequency of each digit (0–9)
    static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        // Initializing digit values
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Counting frequency
        for (int d : digits) {
            frequency[d][1]++;
        }
        return frequency;
    }
}

