class Solution {
    public int search(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(target == nums[mid])
                return mid;
            if(nums[0] <= nums[mid])
            {
                if(target >= nums[l] && target <= nums[mid])
                {
                    u = mid - 1;
                }
                else
                    l = mid + 1;
            }
            else
            {
                if(target >= nums[mid] && target <= nums[u])
                {
                    l = mid + 1;
                }
                else
                    u = mid - 1;
            }
        }

        return -1;
    }
}