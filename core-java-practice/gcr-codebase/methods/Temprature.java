import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        //input temperature
        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();
        //input wind speed
        double value = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is " + value);
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill =
                35.74
                + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }
}

