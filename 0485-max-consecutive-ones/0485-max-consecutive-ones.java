class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int size = nums.length;
        int max = 0, count = 0;
        for(int i = 0; i < size; i++)
        {
            if(nums[i] == 1)
            {
                count++;
            }
            else if(nums[i] == 0)
            {
                if(max < count)
                max = count;
                count = 0;
            }
            if(max < count)
            max = count;
        }

        return max;   
    }
}