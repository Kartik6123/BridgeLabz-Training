import java.util.Arrays;

public class ChallengeSearch {

    // -------- Linear Search: First Missing Positive --------
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        // mark visited positives
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // find first missing
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    // -------- Binary Search: Find Target Index --------
    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        int target = 4;

        // Linear Search part
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);

        // Binary Search part
        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        System.out.println("Target Index after sorting: " + index);
    }
}