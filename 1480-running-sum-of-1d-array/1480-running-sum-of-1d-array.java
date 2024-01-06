class Solution {
    public int[] runningSum(int[] nums) {
        int sumArray[] = new int[nums.length];
        sumArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumArray[i] = sumArray[i-1] + nums[i];
        }
        return sumArray;
    }
}