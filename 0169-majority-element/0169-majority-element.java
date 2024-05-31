class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        for(int i = 0; i < size; i++)
        {
            int count = 0;
            for(int j = 0; j < size; j++)
            {
                if(nums[i] == nums[j])
                count++;
            }

            if(count > size/2)
            return nums[i];
        }

        return 0;
    }
}