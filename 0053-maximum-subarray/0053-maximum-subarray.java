class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int size = nums.length;
        for(int i = 0; i < size; i++)
        {
            sum = sum + nums[i];
            if(max < sum)
            {
                max = sum;
            }

            if(sum < 0)
                sum = 0;
        }

        return max;
    }
}