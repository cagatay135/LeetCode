class Solution {
    public int[] runningSum(int[] nums) {
        int sumArray[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int k = i; k >= 0; k--)
                sum += nums[k];
            sumArray[i] = sum;
        }
        return sumArray;
    }
}