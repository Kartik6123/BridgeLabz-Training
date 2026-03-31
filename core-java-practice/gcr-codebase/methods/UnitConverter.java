import java.util.Scanner;
class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kmValue = sc.nextDouble();
        System.out.println("Converted to miles: " + kmToMiles(kmValue));
        //method call
        System.out.print("Enter distance in miles: ");
        double milesValue = sc.nextDouble();
        System.out.println("Converted to kilometers: " + milesToKm(milesValue));
        //method call
        System.out.print("Enter length in meters: ");
        double metersValue = sc.nextDouble();
        System.out.println("Converted to feet: " + metersToFeet(metersValue));
        //method call
        System.out.print("Enter length in feet: ");
        double feetValue = sc.nextDouble();
        System.out.println("Converted to meters: " + feetToMeters(feetValue));
        //method call
    }

    
    public static double kmToMiles(double distanceInKm) {
        // Converts distance from kilometers to miles
        double conversion = 0.621371;
        return distanceInKm * conversion;
    }

  
    public static double milesToKm(double mileDistance) {
          // Converts distance from miles to kilometers
        double conversion = 1.60934;
        return mileDistance * conversion;
    }

  
    public static double metersToFeet(double meterLength) {
          // Converts length from meters to feet
        double conversion = 3.28084;
        return meterLength * conversion;
    }

    
    public static double feetToMeters(double feetLength) {
        // Converts length from feet to meters
        double conversion = 0.3048;
        return feetLength * conversion;
    }
}
