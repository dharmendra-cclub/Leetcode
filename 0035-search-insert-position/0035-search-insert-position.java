class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        while(l <= u)
        {
            int mid = (l + u)/2;
            if(target == nums[mid])
            {
                return mid;
            }

            if(target < nums[mid])
                u = mid - 1;

            else
                l = mid + 1;
        }

        return u+1;
    }
}