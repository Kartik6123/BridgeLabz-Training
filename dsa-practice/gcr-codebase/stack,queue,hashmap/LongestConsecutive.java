import java.util.*;

class LongestConsecutive{

    static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for (int x : nums) {
            set.add(x);
        }

        for (int x : nums) {

            // Start sequence only if previous number doesn't exist
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}

