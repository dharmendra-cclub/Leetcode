class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int res[] = new int[2];
        for(int  i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(i != j)
                {
                    if(nums[i] + nums[j] == target)
                    {
                        res[0] = i; 
                        res[1] = j;
                        return res;
                    }
                    
                }
            }
        }
        return res;
    }
}