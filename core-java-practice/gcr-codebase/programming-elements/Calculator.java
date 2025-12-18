import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
         float a=sc.nextFloat();//enter first number
        System.out.println("Enter second number:");
        float b=sc.nextFloat();//enter second number
        float sum=a+b;//sum of two numbers
        float difference=a-b;//difference of two numbers
        float product=a*b;//product of two numbers
        float quotient=a/b;//quotient of two numbers
         System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+ a+"and"+b+"is"+" "+sum+", "+difference+", "+product+", "+quotient
            );  
    }
}
