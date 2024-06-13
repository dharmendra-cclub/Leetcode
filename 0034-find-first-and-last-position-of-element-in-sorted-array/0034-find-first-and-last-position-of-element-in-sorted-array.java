class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int size = nums.length - 1;
        int l = 0, u = size - 1;
        while(l <= u)
        {
            int mid = (l+u)/2;
            if(target == nums[mid])
            {
                int initial = mid, last = mid;
                start = mid;
                end = mid;
                while(initial >= 0)
                {
                    if(nums[initial] == target)
                    {
                        start = initial;
                        initial--;
                    }
                    else 
                        break;
                }

                while(last < size)
                {
                    if(nums[last] == target)
                    {
                        end = last;
                        last++;
                    }
                    else
                        break;
                }
            }

            if(target > nums[mid])
                l = mid + 1;
            else
                u = mid - 1;
        }

        int ans[] = new int[2];
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
}