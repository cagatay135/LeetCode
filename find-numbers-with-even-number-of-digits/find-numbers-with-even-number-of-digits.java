class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        
        for (int num : nums) {
            int digitCount = 0;

            while(num != 0)
            {
                num = num / 10; 
                digitCount += 1;
            }
            
            if (digitCount % 2 == 0)
                evenDigitCount += 1;
        }
        
        return evenDigitCount;
    }
}