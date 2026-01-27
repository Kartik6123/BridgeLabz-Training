import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
        finally {
            sc.close();
        }
    }
}
