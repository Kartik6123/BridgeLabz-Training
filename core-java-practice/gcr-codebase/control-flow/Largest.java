import java.util.*;

public class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        boolean firstLargest = (number1 > number2 && number1 > number3);
        // Check if the first number is the largest
        boolean secondLargest = (number2 > number1 && number2 > number3);
        // Check if the second number is the largest
        boolean thirdLargest = (number3 > number1 && number3 > number2);
        // Check if the third number is the largest
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}

