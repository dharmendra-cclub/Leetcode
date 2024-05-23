
class Solution {
    public boolean check(int[] nums) {
        int a[] = nums.clone();
        int length = nums.length;
        boolean flag = true;
        Arrays.sort(a);
        for(int i = 0; i < length; i++)
        {
            int lastElement = a[length-1];
            for(int j = length - 1; j > 0; j--)
            {
                a[j] = a[j-1];
            }
            a[0] = lastElement;
            flag = true;
            for(int k = 0; k < length; k++)
            {
                if(a[k] != nums[k])
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
            return flag;
        }
        return flag;
    }
}