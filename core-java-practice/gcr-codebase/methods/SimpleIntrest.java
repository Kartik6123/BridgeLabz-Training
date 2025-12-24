import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        // Input principal amount
        System.out.print("Enter rate of interest: ");
        double interest = sc.nextDouble();
        // Input rate of interest
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        // Input time period
        double rate = sc.nextDouble();
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
