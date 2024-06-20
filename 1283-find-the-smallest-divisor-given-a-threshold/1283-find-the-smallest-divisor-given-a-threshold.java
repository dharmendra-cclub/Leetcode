class Solution {

    public int calculateSum(int[] nums, int divisor)
    {
        double sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + Math.ceil((double)(nums[i]) / (double)divisor);

        }
        return (int)sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
        }
        
        int l = 1, u = max;
        int ans = -1;

        while(l <= u)
        {
            int mid = (l+u)/2;
            if(calculateSum(nums, mid) <= threshold)
            {
                ans = mid;
                u = mid-1;
            }
            else
                l = mid + 1;
        }

        return ans;
    }
}