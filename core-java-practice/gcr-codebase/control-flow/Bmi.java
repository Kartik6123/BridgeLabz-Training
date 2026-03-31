import java.util.*;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        
        double heightMeter = heightCm / 100;
        // Convert height from cm to meters
        
        double bmi = weight / (heightMeter * heightMeter);
        // Calculate BMI
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            //verify underweight
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            //verify normal weight
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            //verify overweight
            System.out.println("Weight Status: Overweight");
        } else {
            //verify obese
            System.out.println("Weight Status: Obese");
        }
    }
}

