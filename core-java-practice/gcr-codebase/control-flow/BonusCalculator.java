import java.util.Scanner;

public class BonusCalculator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter employee's salary: ");
    int salary=sc.nextInt();
    System.out.print("Enter employee's years of service: ");
    int years=sc.nextInt();
    if(years>5) {
        double bonus=0.05*salary;
        //5% bonus for more than 5 years
        System.out.println("Employee's bonus is: "+bonus);
    } else {
        System.out.println("Employee is not eligible for bonus");
    }
}    
}

