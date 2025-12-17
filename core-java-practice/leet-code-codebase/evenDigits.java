class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;//to store no of even digit numbers
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int c = 0;
            if (a == 0) {//if a==0 , it has 1 digit(odd)
                continue;
            }
            while (a > 0) {
                a = a / 10;//removing last digit
                c++;//counting digits
            }
            if (c % 2 == 0) {//if digit count is even increase the ans
                ans++;
            }
        }
        return ans;
    }
}