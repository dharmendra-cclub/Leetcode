class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int foundNextGreater;

        for(int i = 0; i < nums1.length; i++)
        {
            foundNextGreater = 0;
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    for(int k = j+1 ; k < nums2.length; k++)
                    {
                        if(nums2[k] > nums2[j])
                        {
                            ans[i] = nums2[k];
                            foundNextGreater = 1;
                            break;
                        }
                    }

                    if(foundNextGreater == 0)
                        ans[i] = -1;
                }
            }
        }

        return ans;
    }
}