import java.util.*;

class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // Check each number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is positive and even");
                } else {
                    System.out.println(arr[i] + " is positive and odd");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println(arr[i] + " is zero");
            }
        }
        // Compare first and last elements
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
