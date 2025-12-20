import java.util.*;

class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
         // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
            return;
        }
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIdx = 0;
        int evenIdx = 0;
         // Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIdx] = i;
                evenIdx++;
            } else {
                odd[oddIdx] = i;
                oddIdx++;
            }
        }
        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(odd[i] + " ");
        }
        // Print even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(even[i] + " ");
        }
    }
}

