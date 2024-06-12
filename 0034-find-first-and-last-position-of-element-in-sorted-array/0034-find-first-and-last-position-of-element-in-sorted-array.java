class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        boolean startFound = false;

        int size = nums.length;

        for(int i = 0; i < size; i++)
        {
            if(nums[i] == target && startFound == false)
            {
                startFound = true;
                start = i;
            }

            if(nums[i] == target && startFound == true)
            {
                end = i;
            }
        }

        int ans[] = new int[2];
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
}