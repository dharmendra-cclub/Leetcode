class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        int ans = nums.length;
        while(l <= u)
        {
            int mid = (l + u)/2;
            if(nums[mid] >= target)
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