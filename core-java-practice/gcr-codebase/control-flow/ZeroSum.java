import java.util.*;
public class ZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value =sc.nextDouble();
        System.out.println("Enter numbers,enter 0 to stop:");
        // Calculate sum until zero is entered
        while (value != 0) {
            total = total + value;
            value = sc.nextDouble();
        }
        // Output the total sum
        System.out.println("Total sum is: " + total);
    }
}

