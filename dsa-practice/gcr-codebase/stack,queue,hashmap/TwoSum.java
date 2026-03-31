import java.util.*;

class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            // Check if complement exists
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            // Store index of current element
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}

