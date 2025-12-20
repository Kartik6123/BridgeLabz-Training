import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the BMI Calculator!");
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        // Bmi calculation  
        if(bmi<18.5){
            //BMI Categories
            System.out.printf("Your BMI is, you are underweight", bmi);
        } else if(bmi>=18.5 && bmi<24.9){
            System.out.printf("Your BMI is, you have a normal weight", bmi);
        } else if(bmi>=25){
            System.out.printf("Your BMI is, you are overweight", bmi);
        }  
}
}