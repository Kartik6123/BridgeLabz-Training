import java.util.*;

public class  ZeroSumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter numbers,enter 0 or negative to stop:");
        while (true) {
            // Calculate sum until zero or negative is entered
            double value = sc.nextDouble();
            // Check for termination condition
            if (value <= 0) {
                break;
            }
            // Accumulate the sum
            total = total + value;
        }
        // Output the total sum
        System.out.println("Total sum is: " + total);
    }
}

