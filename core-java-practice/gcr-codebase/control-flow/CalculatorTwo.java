import java.util.Scanner;
public class CalculatorTwo {
    Scanner sc = new Scanner(System.in);
    int first=sc.nextInt();
    int second=sc.nextInt();
    String operator=sc.next();
    public void calculate() {
        // Perform calculation based on operator
        switch (operator) {
            //add cases for each operator
            case "+":
                System.out.println("Addition: " + (first + second));
                break;
            case "-":
                System.out.println("Subtraction: " + (first - second));
                break;
            case "*":
                System.out.println("Multiplication: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Division: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
