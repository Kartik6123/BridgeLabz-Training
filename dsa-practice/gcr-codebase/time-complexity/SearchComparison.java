import java.util.*;

public class SearchComparison {

    // Linear Search method
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // target found
            }
        }
        return -1; // not found
    }

    // Binary Search method (array must be sorted)
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Fill array with values
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Linear Search timing
        long startLinear = System.nanoTime();
        linearSearch(arr, target);
        long endLinear = System.nanoTime();

        // Binary Search timing
        long startBinary = System.nanoTime();
        binarySearch(arr, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");

        sc.close();
    }
}