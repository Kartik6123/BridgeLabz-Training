import java.util.*;

class AreaOfTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();// Input base in inches
        System.out.print("Enter height in inches: ");// Input height in inches
        double height = sc.nextDouble();
        double areaInches = 0.5 * base * height;
        // Area calculation in square 
        double areaCm = areaInches * 6.4516;
        // Conversion from square inches to square centimeters as 1 square inch = 6.4516 square centimeters
    }
}

