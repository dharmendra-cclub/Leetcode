class Solution {
    public int search(int[] nums, int target) {

        int rPoint = -1;
        int ans = -2;
        int l = 0, u = nums.length - 1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                rPoint = i;
                break;
            }
        }

        if(rPoint == -1)
        {
            ans = bs(nums, target, l, u);
                return ans;
        }
        else
        {
            ans = bs(nums, target, 0, rPoint);
            if(ans != -1)
                return ans;
            else if(ans == -1)
            {
                ans =  bs(nums, target, rPoint, u);
                return ans;
            }
                
        }

        return -1;
    }

    public int bs(int nums[], int target, int l, int u)
    {
        int ans = -1;
        while(l <= u)
            {
                int mid = (l+u)/2;
                if(nums[mid] == target)
                {
                    return mid;
                }

                if(target > nums[mid])
                {
                    l = mid + 1;
                }

                else
                    u = mid - 1;
            }
        return ans;
    }
}