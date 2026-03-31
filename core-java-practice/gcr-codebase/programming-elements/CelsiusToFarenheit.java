import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double c = sc.nextDouble();//input in celsius
        double f = (c * 9/5) + 32;//conversion formula
        System.out.println("Temperature in Fahrenheit: " + f);//output in fahrenheit
    }
}