class Solution {
    public int findMin(int[] nums) {
        int l = 0, u = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(nums[mid] >= nums[l])
            {
                min = Math.min(min, nums[l]);
                l = mid + 1;
            }
            else
            {
                min = Math.min(min, nums[mid]);
                u = mid - 1;
            }
        }

        return min;
    }
}