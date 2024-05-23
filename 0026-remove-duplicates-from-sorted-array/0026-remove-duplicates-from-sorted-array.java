class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 1;
        int key = nums[0];
        int size = nums.length;
        for(int i = 1; i < size; i++)
        {
            if(key == nums[i])
            continue;
            else
            {
                nums[p++] = nums[i];
                key = nums[i];
            }
        }
        return p;
    }
}