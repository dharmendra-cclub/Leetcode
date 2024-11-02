class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count0++;
            }
            else if(nums[i] == 1)
            {
                count1++;
            }

            else if(nums[i] == 2)
            {
                count2++;
            }
        }

        int k = 0;
        while(count0 > 0 || count1 > 0 || count2 > 0)
        {
            if(count0 != 0)
            {
                nums[k++] = 0;
                count0--;
            }
            else if(count1 != 0)
            {
                nums[k++] = 1;
                count1--;
            }
            else if(count2 != 0)
            {
                nums[k++] = 2;
                count2--;
            }
        }
    }
}