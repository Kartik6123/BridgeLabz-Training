import java.util.Scanner;
public class QuoientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        // first number input
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
         // second number input
        int quotient = a / b;
        // quotient calculation
        int remainder = a % b;
        // remainder calculation
         System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + a + " and " + b);
    }
}
