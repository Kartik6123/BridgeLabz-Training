import java.util.*;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        boolean result = (number % 5 == 0);
        // Check divisibility by 5
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
