import java.util.Scanner;

class UnitConvertorThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitValue = sc.nextDouble();
        System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheitValue));

        System.out.print("Enter temperature in Celsius: ");
        double celsiusValue = sc.nextDouble();
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsiusValue));

        System.out.print("Enter weight in pounds: ");
        double value = sc.nextDouble();
        System.out.println("Kilograms: " + poundsToKilograms(value));

        System.out.print("Enter weight in kilograms: ");
        double kilogramsValue = sc.nextDouble();
        System.out.println("Pounds: " + kilogramsToPounds(kilogramsValue));

        System.out.print("Enter volume in gallons: ");
        double gallonsValue = sc.nextDouble();
        System.out.println("Liters: " + gallonsToLiters(gallonsValue));

        System.out.print("Enter volume in liters: ");
        double litre = sc.nextDouble();
        System.out.println("Gallons: " + litersToGallons(litre));
    }

    // Converts Fahrenheit temperature to Celsius
    public static double fahrenheitToCelsius(double fahrenheitValue) {
        double result = (fahrenheitValue - 32) * 5 / 9;
        return result;
    }

    // Converts Celsius temperature to Fahrenheit
    public static double celsiusToFahrenheit(double celsiusValue) {
        double result = (celsiusValue * 9 / 5) + 32;
        return result;
    }

    // Converts pounds to kilograms
    public static double poundsToKilograms(double value) {
        double conversion = 0.453592;
        return value * conversion;
    }

    // Converts kilograms to pounds
    public static double kilogramsToPounds(double kilogramsValue) {
        double conversion = 2.20462;
        return kilogramsValue * conversion;
    }

    // Converts gallons to liters
    public static double gallonsToLiters(double gallonsValue) {
        double conversion = 3.78541;
        return gallonsValue * conversion;
    }

    // Converts liters to gallons
    public static double litersToGallons(double litre) {
        double conversion = 0.264172;
        return litre * conversion;
    }
}

