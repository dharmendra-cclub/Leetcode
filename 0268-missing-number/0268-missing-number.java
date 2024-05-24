class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        boolean a[] = new boolean[size + 1];
        int missingNum = 0;
        for(int i = 0; i <= size; i++)
        {
            a[i] = false;
        }
        
        for(int i = 0; i < size; i++)
        {
            a[nums[i]] = true;
        }

        for(int i = 0; i <= size; i++)
        {
            if(a[i] == false)
            {
                missingNum = i;
                break;
            }
            
        }

        return missingNum;
    }
}