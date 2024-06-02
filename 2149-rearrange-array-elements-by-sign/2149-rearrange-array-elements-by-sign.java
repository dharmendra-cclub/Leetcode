class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int positives[] = new int[size/2];
        int negatives[] = new int[size/2];
        int k = 0, j = 0;
        for(int i = 0; i < size; i++)
        {
            if(nums[i] > 0)
            positives[k++] = nums[i];
            else
            negatives[j++] = nums[i];
        }
        k = 0;
        j = 0;
        while(k < size && j < size/2)
        {
            nums[k++] = positives[j];
            nums[k++] = negatives[j];
            j++;
        }

        return nums;
    }
}