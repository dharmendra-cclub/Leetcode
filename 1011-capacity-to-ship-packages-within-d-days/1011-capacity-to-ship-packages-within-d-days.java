class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, ans = -1, max = Integer.MIN_VALUE;
        for(int i = 0; i < weights.length; i++)
        {
            sum = sum + weights[i];
            if(max < weights[i])
                max = weights[i];
        }

        int l = max, u = sum;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(noOfDays(weights, days, mid) <= days)
            {
                ans = mid;
                u = mid - 1; 
            }
            else
                l = mid + 1;
        }

        return ans;
    }

    public int noOfDays(int[] arr, int days, int capacity)
    {
        int sum = 0, count = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(sum + arr[i] > capacity)
            {
                count++;
                sum = arr[i];
            }
            else
            sum = sum + arr[i];
        }

        return count;
    }
}