class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int majority = nums[0];
        int count = 1;
        for(int i = 1; i < size; i++)
        {
            if(count == 0)
            {
                majority = nums[i];
            }
            if(nums[i] == majority)
            {
                count++;
            }
            else
            count--;         
        }

        return majority;
    }
}