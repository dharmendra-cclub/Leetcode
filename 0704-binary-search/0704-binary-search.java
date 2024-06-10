class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int u = nums.length - 1;
        int mid = (l+u)/2; 
        while(l < u)
        {
            if(target == nums[mid])
            {
                return mid;
            }     
            if(target < nums[mid])
            {
                u = mid - 1;
            }              
            else if(target > nums[mid])
            {
                l = mid + 1;
            }    
            mid = (l+u)/2;            
        }
        return -1;
    }
}