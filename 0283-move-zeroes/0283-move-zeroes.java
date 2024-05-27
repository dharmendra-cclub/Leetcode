class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int counter = 0;
        for(int i = 0; i < size; i++)
        {
            if(nums[i] != 0)
            {
                nums[counter++] = nums[i];
            }
        }

        for(int i = counter; i < size; i++)
        nums[i] = 0;
    }
}