class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int len = 0;
            int p = k;
            for(int j = i; j < nums.length; j++)
            {
                if(nums[j] == 0)
                    p--;
                if(p >= 0)
                    len++;
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}