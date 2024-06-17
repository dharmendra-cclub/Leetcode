class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        int ans = nums.length;
        while(l <= u)
        {
            int mid = (l+u)/2;

            if(nums[mid] == target)
            {
                return true;
            }

            if(nums[l] == nums[mid] && nums[mid]  == nums[u])
            {
                l = l + 1;
                u = u - 1;
                continue;
            }

            if(nums[mid] >= nums[l])
            {
                if(target >= nums[l] && target <= nums[mid])
                {
                    ans = mid;
                    u = mid - 1;
                }

                else
                    l = mid + 1;
            }

            else
            {
                if(target >= nums[mid] && target <= nums[u])
                {
                    ans = mid;
                    l = mid + 1;
                }

                else
                    u = mid - 1;
            }
        }

        if(ans == nums.length || target != nums[ans])
            return false;
        
        return true;
    }
}