class Solution {

    public int calculateSum(int[] nums, int divisor)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % divisor != 0)
            {
                sum = sum + nums[i]/divisor + 1;
            }
            else
                sum = sum + nums[i]/divisor;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int divisor = 1;
        int sum = Integer.MAX_VALUE;
        while(sum >= threshold)
        {
            sum = calculateSum(nums, divisor);
            divisor++;
        }

        return divisor-1;
    }
}