import java.util.Scanner;

public class NumberCheckerThree {

    // Main method to take input and check palindrome & duck number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Extracting digits and reversing them
        int[] digits = getDigits(number);
        int[] reversedDigits = reverseDigits(digits);

        // Display original digits
        System.out.print("Digits: ");
        printArray(digits);

        // Display reversed digits
        System.out.print("Reversed Digits: ");
        printArray(reversedDigits);

        // Checking palindrome and duck number
        System.out.println("Palindrome Number: " + isPalindrome(digits, reversedDigits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }

    // Method to count number of digits in a number
    static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to extract digits of a number into an array
    static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two integer arrays
    static boolean compareArrays(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check whether the number is palindrome
    static boolean isPalindrome(int[] digits, int[] reversedDigits) {
        return compareArrays(digits, reversedDigits);
    }

    // Method to check whether the number is a Duck number
    static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    // Utility method to print array elements
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

