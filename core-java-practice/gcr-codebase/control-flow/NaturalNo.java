import java.util.*;

public class NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number");
        } 
        else {
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                // Calculate sum using while loop
                sumWhile = sumWhile + i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            // Display both results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumWhile == sumFormula) {
                // Verify both results are equal
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}

