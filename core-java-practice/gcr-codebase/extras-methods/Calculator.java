 import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter an operator +, -, *, /: ");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            // Perform operation based on operator
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
    }
    static double add(double a, double b) {
        // Adds two numbers
        return a + b;
    }
    static double subtract(double a, double b) {
        // Subtracts two numbers
        return a - b;
    }
    static double multiply(double a, double b) {
        // Multiplies two numbers
        return a * b;
    }
    static double divide(double a, double b) {
        // Handle division by zero
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return a / b;
    }
}
