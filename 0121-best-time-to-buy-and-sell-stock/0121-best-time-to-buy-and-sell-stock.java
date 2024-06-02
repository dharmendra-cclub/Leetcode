class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int size = prices.length;
        for(int i = 1; i < size; i++)
        {
            int max = prices[i];
            if(max - min < 0)
            {
                min = prices[i];
            }
            if(maxProfit < max - min)
            {
                maxProfit = max - min;
            }
        }
        return maxProfit;
    }
}