class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();//hashmap to store the value and its index for O(1) search time
        int a[] = new int[2];
        for (int i = 0; i < nums.length; i++) {//iterate through the array
            if (map.containsKey(target - nums[i])) {//if(target - nums[i]) exists , we found the ans as nums[i] + (target - nums[i]) = target
                a[0] = map.get(target - nums[i]);
                a[1] = i;
            } else {
                map.put(nums[i], i);//storing the values and its index in the map
            }
        }
        return a;
    }
}