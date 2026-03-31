import java.util.*;

class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int members = 10;
        double[][] heightWeight = new double[members][2];
        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");
        for (int i = 0; i < members; i++) {
            System.out.print( " Weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print(" Height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] bmiData = generateBMITable(heightWeight);
        displayBMITable(bmiData);
    }

    // Method to generate BMI table
    static String[][] generateBMITable(double[][] heightWeight) {
        String[][] result = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            String[] bmiRes = calculateBMI(heightWeight[i][0], heightWeight[i][1]);
            result[i][0] = String.valueOf(heightWeight[i][1]);  
             // Height
            result[i][1] = String.valueOf(heightWeight[i][0]);  
             // Weight
            result[i][2] = bmiRes[0];               
            // BMI
            result[i][3] = bmiRes[1];               
            // Status
        }

        return result;
    }

    // Method to calculate BMI and status
    static String[] calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        String[] result = new String[2];
        result[0] = String.valueOf(bmi);
        result[1] = status;
        return result;
    }
    // Method to display BMI table
    static void displayBMITable(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                data[i][0] + "\t" +
                data[i][1] + "\t" +
                data[i][2] + "\t" +
                data[i][3]
            );
        }
    }
}
