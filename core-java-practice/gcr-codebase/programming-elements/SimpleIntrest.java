import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double p = sc.nextDouble();//input principal amount
        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();//input rate of interest
        System.out.println("Enter time in years:");
        double t = sc.nextDouble();//input time period
        double si = (p * r * t) / 100;//simple interest formula
        System.out.println("Simple Interest : " + si);//output
    }
}
