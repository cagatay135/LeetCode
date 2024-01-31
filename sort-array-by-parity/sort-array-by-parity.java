class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int lastIndex =  nums.length - 1;

        while (i < lastIndex) {
            if (nums[i] % 2 == 0) {
                i += 1;
            } else if (nums[lastIndex] % 2 == 1) {
                lastIndex -= 1;
            } else {
                int temp = nums[i];
                nums[i] = nums[lastIndex];
                nums[lastIndex] = temp;
                i += 1;
                lastIndex -= 1;
            }
        }
        
        return nums;
    }
}
