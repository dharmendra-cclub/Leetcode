class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generateSubsets(nums, 0, list, result);

        return result;
    }

    public void generateSubsets(int[] nums, int index, List<Integer> list, List<List<Integer>> result)
    {
        if(index == nums.length)
        {
             result.add(new ArrayList<>(list));
            return;
        }

        generateSubsets(nums, index + 1, list, result);
        //list.add(nums[index]);
        List<Integer> newSubsequence = new ArrayList<>(list);
        newSubsequence.add(nums[index]);
        generateSubsets(nums, index + 1, newSubsequence, result);
    }
}