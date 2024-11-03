class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int size = nums.length;
        // int positives[] = new int[size/2];
        // int negatives[] = new int[size/2];
        // int k = 0, j = 0;
        // for(int i = 0; i < size; i++)
        // {
        //     if(nums[i] > 0)
        //     positives[k++] = nums[i];
        //     else
        //     negatives[j++] = nums[i];
        // }
        // k = 0;
        // j = 0;
        // while(k < size && j < size/2)
        // {
        //     nums[k++] = positives[j];
        //     nums[k++] = negatives[j];
        //     j++;
        // }

        // return nums;
        int left = 0, right = 0;
        int ans[] = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length/2; i++)
        {
            while(nums[left] < 0)
                left++;
            while(nums[right] > 0)
                right++;
            ans[k++] = nums[left++];
            ans[k++] = nums[right++];
        }

        return ans;
    }
}