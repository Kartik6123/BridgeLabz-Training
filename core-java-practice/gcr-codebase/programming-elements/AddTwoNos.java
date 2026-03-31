import java.util.Scanner;

public class AddTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();//enter first number
        System.out.println("Enter second number:");
        int b = sc.nextInt();//enter second number
        int sum = a + b;//sum of two numbers
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
