import java.util.Scanner;

public class FactorialRecursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to calculate its factorial: ");
    int number = sc.nextInt();
    long result = factorial(number);
    System.out.println("The factorial of " + number + " is: " + result);
  }   
    // Recursive method to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
