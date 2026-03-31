import java.util.*;

class PairSum {

    static boolean hasPair(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {

            // Check if complement exists
            if (map.containsKey(target - x)) {
                return true;
            }

            // Store current element
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}

