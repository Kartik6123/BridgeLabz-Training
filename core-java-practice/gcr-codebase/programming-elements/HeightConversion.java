import java.util.Scanner;

public class HeightCoversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in centimeters:");
        double cm = sc.nextDouble(); // height in cm
        double inches = cm / 2.54; // conversion to inches
        double feet = inches / 12; // conversion to feet
        System.out.println("Your Height in cm is: " + cm + " while in feet is: " + feet + " and inches is: " + inches);
    }
}
