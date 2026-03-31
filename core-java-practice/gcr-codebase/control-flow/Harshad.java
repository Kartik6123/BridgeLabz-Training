import java.util.Scanner;
public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sumOfDigits = 0;
        int temp = number;
        while (temp != 0) {
            // Calculate sum of digits
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        if (number % sumOfDigits == 0) {
            // Check if number is divisible by sum of digits
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

    }
}
