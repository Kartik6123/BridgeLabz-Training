import java.util.*;
public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number > 0) {
            // Check if number is positive
            System.out.println("Positive");
        } else if (number < 0) {
            // Check if number is negative
            System.out.println("Negative");
        } else {
            // Number is zero
            System.out.println("Zero");
        }
    }
}

