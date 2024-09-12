class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int len = 0, noOfZeroes = 0;
            for(int j = i; j < nums.length; j++)
            {
                if(nums[j] == 0)
                    noOfZeroes++;
                if(noOfZeroes > k) break;
                len++;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}