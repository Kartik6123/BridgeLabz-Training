import java.util.*;

public class MaximumOfThree {
    public static void main(String[] args) {
        int[] numbers = readNumbers();
        int maxValue = findMaximum(numbers);
        displayResult(maxValue);
    }
    // Takes three integers from the user
    static int[] readNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[3];

        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }
    // Determines the maximum among three numbers
    static int findMaximum(int[] values) {
        int largest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }
        return largest;
    }

    // Displays the result
    static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }
}
