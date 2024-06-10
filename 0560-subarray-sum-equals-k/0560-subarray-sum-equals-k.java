class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, counter = 0;
        map.put(sum, 1);
        for(int i = 0; i < size; i++)
        {
            sum = sum + nums[i];
            if(map.containsKey(sum-k))
            {
                counter = counter + map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return counter;
    }
}

            // if(map.containsKey(sum-k))
            // {
                // counter = counter + map.get(sum-k);
                // map.put(sum, map.get(sum-k)+1);
            // }
            // else
            // map.put(sum,1);