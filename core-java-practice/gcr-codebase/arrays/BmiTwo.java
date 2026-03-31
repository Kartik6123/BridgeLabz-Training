import java.util.*;

class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] person = new double[number][3];
        String[] weight = new String[number];

        // Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            do {
                System.out.print("Enter weight (kg): ");
                person[i][0] = sc.nextDouble();
            } while (person[i][0] <= 0);

            do {
                System.out.print("Enter height (meters): ");
                person[i][1] = sc.nextDouble();
            } while (person[i][1] <= 0);
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double w= person[i][0];
            double height = person[i][1];

            person[i][2] = w / (height * height);

            if (person[i][2] < 18.5) {
                weight[i] = "Underweight";
            } else if (person[i][2] < 25) {
                weight[i] = "Normal";
            } else if (person[i][2] < 30) {
                weight[i] = "Overweight";
            } else {
                weight[i] = "Obese";
            }
        }

         // Display result
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + person[i][0] + " kg");
            System.out.println("Height: " + person[i][1] + " m");
            System.out.println("BMI: " + String.format("%.2f", person[i][2]));
            System.out.println("Status: " + weight[i]);
            System.out.println();
        }
    }
}

