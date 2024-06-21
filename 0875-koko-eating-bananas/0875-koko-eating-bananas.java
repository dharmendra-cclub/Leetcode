class Solution {
    public int func(int[] piles, int mid)
    {
        double totalHours = 0;
        for(int i = 0; i < piles.length; i++)
        {
            totalHours = totalHours + Math.ceil((double)(piles[i]) / (double)mid);
        }
        return (int)totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++)
        {
            if(max < piles[i])
            {
                max = piles[i];
            }
        }
        int l = 1, u = max;
        int ans = -1;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(func(piles, mid) <= h)
            {
                ans = mid;
                u = mid - 1;
            }
            else
                l = mid + 1;
        }

        return ans;
    }
}