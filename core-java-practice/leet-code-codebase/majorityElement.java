class MajorityElement {
    public int majorityElement(int[] nums) {
        int f = 1;//count frequency
        int ans = nums[0];//assuming first element as majority element
        int i = 1;//starting from second element
        while (i < nums.length) {
            if (nums[i] == ans) {//if current element is same as ans ,increase f
                f++;
            } else {//if different , decrease f
                f--;
            }
            if (f == 0) {//if f becomes 0 , we change our ans to current element and reset f to 1 assuming it as majority element
                ans =nums[i];
                f++;
            }
            i++;
        }
        return ans;
    }
}
