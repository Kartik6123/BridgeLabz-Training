import java.util.*;

public class SearchComparisonDS {

    // Array Linear Search O(N)
    static boolean arraySearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int target = n / 2;

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, end;

        // Array Search
        start = System.nanoTime();
        arraySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) + " ns");

        // HashSet Search
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        // TreeSet Search
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");

        sc.close();
    }
}