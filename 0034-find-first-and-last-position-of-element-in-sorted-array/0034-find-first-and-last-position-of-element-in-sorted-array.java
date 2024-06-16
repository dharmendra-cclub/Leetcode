class Solution {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        int l = 0, u = size - 1;
        int upper_bound = size, lower_bound = size;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(nums[mid] >= target)
            {
                lower_bound = mid;
                u = mid - 1;
            }

            else
                l = mid + 1;
        }
        l = 0;
        u = size - 1;
        while(l <= u)
        {
        int mid = (l+u)/2;
        if(nums[mid] > target)
        {
            upper_bound = mid;
            u = mid - 1;
        }

        else
            l = mid + 1;
        }

        // if(lower_bound == -1 && upper_bound == -1)
        //  return new int[] {-1, -1};

        if(lower_bound == size || nums[lower_bound] != target)
            return new int[] {-1, -1};

        return new int[] {lower_bound, upper_bound - 1};
    }
}