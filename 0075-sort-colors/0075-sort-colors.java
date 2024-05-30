class Solution {
    public void sortColors(int[] nums) {
        int hash[] = new int[3];
        hash[0] = 0;
        hash[1] = 0;
        hash[2] = 0;
        int k = 0;
        int size = nums.length;
        for(int i = 0; i < size; i++)
        {
            hash[nums[i]]++;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < hash[i]; j++)
            nums[k++] = i; 
        }
    }
}