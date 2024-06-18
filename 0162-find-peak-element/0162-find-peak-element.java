class Solution {
    public int findPeakElement(int[] nums) {
        // Optimal approach
        int size = nums.length;
        if(nums.length == 1)
            return 0;
        int l = 0, u = nums.length - 1;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(mid == 0)
            {
                if(nums[mid] > nums[mid+1])
                {
                    return mid;
                }
                else
                l = mid + 1;
            }
            else if(mid == size-1 && nums[mid] > nums[size - 2])
                return mid;
            else if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
                return mid;
            else if(nums[mid+1] > nums[mid-1])
                l = mid + 1;
            else
                u = mid - 1;
        }

        return -1;
    }
}