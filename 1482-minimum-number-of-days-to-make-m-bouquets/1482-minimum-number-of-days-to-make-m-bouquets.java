class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = -1;

        for(int i = 0; i < bloomDay.length; i++)
        {
            if(min > bloomDay[i])
                min = bloomDay[i];
            if(max < bloomDay[i])
                max = bloomDay[i];
        }

        int l = min; int u = max;

        while(l <= u)
        {
            int mid = (l+u)/2;

            if(checkPossible(bloomDay, m, k, mid) == true)
            {
                ans = mid;
                u = mid - 1;
            }
            else
                l = mid + 1;
            
        }

        return ans;
    }

    public boolean checkPossible(int[] arr, int m, int k, int day)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= day)
                count++;
            else
            {
                m = m - count/k;
                if(m <= 0)
                {
                    return true;
                }
                count = 0;
            }
        }

        m = m - count/k;
        if(m <= 0)
        {
            return true;
        }

        return false;
    }
}

    
