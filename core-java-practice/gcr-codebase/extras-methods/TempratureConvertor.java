import java.util.Scanner;

public class TempratureConvertor {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature in Celsius: ");
    double celsius = sc.nextDouble();
    double fahrenheit = covertTemprature(celsius);
    System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
   }   
    static double covertTemprature(double celsius) {
        // Converts Celsius to Fahrenheit
        return (celsius * 9/5) + 32;
    }
}
