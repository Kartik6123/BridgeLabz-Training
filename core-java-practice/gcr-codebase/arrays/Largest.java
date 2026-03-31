import java.util.*;
class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr number");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] arr = new int[maxDigit];
        int idx = 0;
        while (number != 0) {
            // Extract digits and store in array
            if (idx == maxDigit) {
                break;
                // Prevent overflow
            }
            arr[idx] = number % 10;
            // Get last digit
            number = number / 10;
            // Remove last digit
            idx++;
            // Increment index
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < idx; i++) {
            if (arr[i] > largest) {
                // Update largest and second largest
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
    }
}
