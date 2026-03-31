import java.util.*;

class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        // Extract digits and store in array
        while (num > 0) {
             //lop to extract each digit
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                // Increase array size if needed
                int[] temp = new int[maxDigit];
                // Create new larger array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                    // Copy old digits to new array
                }
                digits = temp;
                // Update reference to new array
            }
            digits[index] = num % 10;
            // Get last digit
            index++;
            // Increment index
            num = num / 10;
            // Remove last digit
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        // Output results
        if (secondLargest == -1) {
            System.out.println("Second largest digit not found");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}
