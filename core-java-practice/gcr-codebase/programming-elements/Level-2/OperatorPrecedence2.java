import java.util.Scanner;
public class OperatorPrecedence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        // first input
        double b = sc.nextDouble();
        // second input
        double c = sc.nextDouble();
        // third input
        double operation1 = a + b * c;
        // first operation
        double operation2 = a * b + c;
        // second operation
        double operation3 = c + a / b;
        // third operation
        double operation4 = a % b + c;
        // fourth operation
        System.out.print("The results of double Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
}}
