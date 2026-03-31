import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder:");
        double r = sc.nextDouble();//input radius
        System.out.println("Enter height of the cylinder:");
        double h = sc.nextDouble();//input height
        double v = Math.PI * r * r * h;//volume calculation formula
        System.out.println("Volume of the cylinder with radius " + r + " and height " + h + " is: " + v);//output
    }
}
