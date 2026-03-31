 import java.util.Scanner;

class UnitConvertorTwo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in yards: ");
        double yardValue = sc.nextDouble();
        System.out.println("Feet: " + yardsToFeet(yardValue));

        System.out.print("Enter value in feet: ");
        double feetValue = sc.nextDouble();
        System.out.println("Yards: " + feetToYards(feetValue));

        System.out.print("Enter value in meters: ");
        double meterValue = sc.nextDouble();
        System.out.println("Inches: " + metersToInches(meterValue));

        System.out.print("Enter value in inches: ");
        double inchValue = sc.nextDouble();
        System.out.println("Meters: " + inchesToMeters(inchValue));

        System.out.print("Enter value in inches (for cm conversion): ");
        double inchForCm = sc.nextDouble();
        System.out.println("Centimeters: " + inchesToCentimeters(inchForCm));
    }

    // Converts yards into feet
    public static double yardsToFeet(double yardValue) {
        double conversionFactor = 3;
        return yardValue * conversionFactor;
    }

    // Converts feet into yards
    public static double feetToYards(double feetValue) {
        double conversionFactor = 0.333333;
        return feetValue * conversionFactor;
    }

    // Converts meters into inches
    public static double metersToInches(double meterValue) {
        double conversionFactor = 39.3701;
        return meterValue * conversionFactor;
    }

    // Converts inches into meters
    public static double inchesToMeters(double inchValue) {
        double conversionFactor = 0.0254;
        return inchValue * conversionFactor;
    }

    // Converts inches into centimeters
    public static double inchesToCentimeters(double inchValue) {
        double conversionFactor = 2.54;
        return inchValue * conversionFactor;
    }
}

