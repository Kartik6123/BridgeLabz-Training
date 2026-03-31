import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();//input first number
        System.out.println("Enter second number:");
        int b=sc.nextInt();//input second number
        System.out.println("Enter third number:");
        int c=sc.nextInt();//input third number
        double avg=(a+b+c)/3.0;//average calculation formula
        System.out.println("Average is :" + avg);//output
    }
}
