class Solution {
    public int longestOnes(int[] nums, int k) {
        //Brute force
        // int maxLen = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     int len = 0, noOfZeroes = 0;
        //     for(int j = i; j < nums.length; j++)
        //     {
        //         if(nums[j] == 0)
        //             noOfZeroes++;
        //         if(noOfZeroes > k) break;
        //         len++;
        //         maxLen = Math.max(maxLen, len);
        //     }
        // }

        // return maxLen;



        //Optimal approach
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == 0)    li.add(i);

        int left = 0, right = 0, len = 0, maxLen = 0, noOfZeroes = 0;
        int j = 0;
        while(right < nums.length)
        {
            if(nums[right] == 0)    noOfZeroes++;
            if(noOfZeroes > k)
            {
                left = li.get(j) + 1;
                noOfZeroes--;
                j++;
            }
            len = right - left + 1;
            maxLen = Math.max(len, maxLen);
            right++;
        }

        return maxLen;
    }
}