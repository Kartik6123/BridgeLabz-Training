import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r = sc.nextDouble();//input radius
        double a = Math.PI * r * r;//area calculation formula
        System.out.println("Area of the circle with radius " + r + " is: " + a);//output
    }
}
