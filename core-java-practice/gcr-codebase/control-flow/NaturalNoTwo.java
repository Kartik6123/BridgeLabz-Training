import java.util.*;

public class  NaturalNoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                // Calculate sum using for loop
                sumFor = sumFor + i;
            }
            // Calculate sum using formula
            int sumFormula = n * (n + 1) / 2;
            // Display both results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumFor == sumFormula) {
                // Verify both results are equal
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}

