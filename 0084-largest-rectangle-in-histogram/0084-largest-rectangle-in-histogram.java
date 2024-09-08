class Solution {
    public int largestRectangleArea(int[] heights) {
        //if(heights.length == 1) return heights[0];
        int ans = 0;
        for(int i = 0; i < heights.length; i++)
        {
            int min = heights[i];
            int count = 1;
            for(int j = i; j < heights.length; j++)
            {
                if(min > heights[j])    min = heights[j];
                if((min * count) > ans) ans = min * count;
                count++;
            }
        }

        return ans;
    }
}