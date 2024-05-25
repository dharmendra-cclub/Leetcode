class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        int res = nums[0];
        for(int i = 1; i < size; i++)
        {
            res = res ^ nums[i];
        }

        return res;
    }
}