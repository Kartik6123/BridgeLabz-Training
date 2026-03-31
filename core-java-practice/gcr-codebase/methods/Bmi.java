import java.util.Scanner;

class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        // 10 persons, 3 columns -> weight, height(cm), BMI
        for (int index = 0; index < data.length; index++) {
            // Take input for weight and height
            System.out.print("Enter weight (kg) of person " + (index + 1) + ": ");
            data[index][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (index + 1) + ": ");
            data[index][1] = sc.nextDouble();
        }
        calculateBMI(data);
        // Calculate BMI and store in 3rd column
        // Get BMI status for all persons
        String[] bmiStatus = bmiStatus(data);
        System.out.println("\nWeight\tHeight(cm)\tBMI\t\tStatus");
        for (int index = 0; index < data.length; index++) {
             // Display final result
            System.out.println(
                data[index][0] + "\t" +
                data[index][1] + "\t" +
                String.format("%.2f", data[index][2]) + "\t" +
                bmiStatus[index]
            );
        }
    }

    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int index = 0; index < data.length; index++) {
            double weight = data[index][0];
            double heightInMeters = data[index][1] / 100;

            double bmiValue = weight / (heightInMeters * heightInMeters);
            data[index][2] = bmiValue;
        }
    }

    // Method to determine BMI status
    public static String[] bmiStatus(double[][] data){ 
        String[] statusArray = new String[data.length];

        for (int index = 0; index < data.length; index++) {
            double bmi = data[index][2];

            if (bmi <= 18.4)
                statusArray[index] = "Underweight";
            else if (bmi <= 24.9)
                statusArray[index] = "Normal";
            else if (bmi <= 39.9)
                statusArray[index] = "Overweight";
            else
                statusArray[index] = "Obese";
        }

        return statusArray;
    }
}

