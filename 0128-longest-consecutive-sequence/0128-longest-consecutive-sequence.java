class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 1, longest = 1;
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        for(Integer i : set)
        {
            if(set.contains(i-1))
            {

            }
            else
            {
                int start = i;
                while(set.contains(++start))
                {
                    max++;
                }
                if(longest < max)
                {
                    longest = max;
                }
                max = 1;
            }
        }

        return longest;
    }
}