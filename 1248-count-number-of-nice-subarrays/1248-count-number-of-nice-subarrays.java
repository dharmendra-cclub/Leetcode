class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int nice = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int countOdd  = 0;
            for(int j = i; j < nums.length; j++)
            {
                if(nums[j] % 2  == 1)
                    countOdd++;
                if(countOdd == k)
                    nice++;
                if(countOdd > k)
                    break;
            }
        }

        return nice;
    }
}