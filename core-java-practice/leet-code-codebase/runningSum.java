class Solution {
    public int[] runningSum(int[] nums) {
        int ps = 0;//variable to store the sum till previous index
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = ps + nums[i];//value at current index is prev sum(ps)+curr val(nums[i])
            ps = ps + nums[i];//adding current value to ps 
        }
        return a;
    }
}