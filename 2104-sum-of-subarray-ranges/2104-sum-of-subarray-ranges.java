class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            long min = nums[i];
            long max = nums[i];
            for(int j = i; j < nums.length; j++)
            {
                if(min >= nums[j])
                    min = nums[j];
                if(max <= nums[j])
                    max = nums[j];
                
                long range = max - min;
                sum = sum + range;
            }
        }

        return sum;
    }
}