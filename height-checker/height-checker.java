class Solution {
    public int heightChecker(int[] heights) {
        int difference = 0;
        
        int[] orderedHeights = heights.clone();
        Arrays.sort(orderedHeights);
        
        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != orderedHeights[i]) {
                difference+=1;
            }
        }
        return difference;  
    }
}