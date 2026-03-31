import java.util.Scanner;

public class GcdLcm {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();
    int gcd = calculateGCD(num1, num2);
    // Calculate GCD
    int lcm = (num1 * num2) / gcd;
    // Calculate LCM using GCD
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
 }   
    // Method to calculate GCD using Euclidean algorithm
    static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
