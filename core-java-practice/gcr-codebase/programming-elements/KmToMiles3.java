import java.util.Scanner;
class KmToMiles3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble(); // Input distance in kilometers
        double mile = km * 1.6; // 1mile = 1.6 kilometers
        System.out.println("The distance in miles is: " + mile); // Output
    }
}