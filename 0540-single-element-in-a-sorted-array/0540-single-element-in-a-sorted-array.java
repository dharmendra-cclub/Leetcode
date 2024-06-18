class Solution {
    //Brute Force
    public int singleNonDuplicate(int[] nums) {
        int l = 0, u = nums.length - 1;
        int ans = -1;
        if(nums.length == 1)
        {
            return nums[0];
        }
        l++;
        u--;

        while(l <= u)
        {
            int mid = (l+u)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
            {
                return nums[mid];
            }

            if((mid % 2 == 0 && nums[mid] == nums[mid-1]) 
            || (mid % 2 == 1 && nums[mid] == nums[mid+1]))
            {
                u = mid - 1;
            }

            else
                l = mid + 1;
        }

        return -1;
    }
}