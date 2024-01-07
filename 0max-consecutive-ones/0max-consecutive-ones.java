class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int currentCount = 0;
        int maxCount = 0;
        
        for (int i = 0; i<nums.length; i++) {
            if (i==0) {
                if (nums[i] == 1)
                    currentCount += 1;
            }
            else if (nums[i] == 1) {
                currentCount+=1;
            }   
            else {
                currentCount = 0;
            }
            
            maxCount = Math.max(currentCount,maxCount);
        }
        return maxCount;
    }
}