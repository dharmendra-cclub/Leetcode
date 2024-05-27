class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        while(k > 0)
        {
            int lastElement = nums[size - 1];
            
            for(int i = size - 1; i > 0; i--)
            nums[i] = nums[i-1];

            nums[0] = lastElement;
            k--;
        }
    }
}