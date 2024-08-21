class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int lastGreater = -1;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] > nums[nums.length-1])
            {
                lastGreater = nums[i];
                break;
            }
        }
        ans[nums.length-1] = lastGreater;
        stack.push(nums[nums.length-1]);

        for(int i = nums.length-2; i >= 0; i--)
        {
            if(stack.isEmpty())
            {
                stack.push(nums[i]);
                ans[i] = -1;
            }
            else if(nums[i] <= stack.peek())
            {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
            else if(nums[i] > stack.peek())
            {
                while(!stack.isEmpty() && nums[i] > stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    ans[i] = -1;
                    stack.push(nums[i]);
                }   
                else
                {
                    ans[i] = stack.peek();
                    stack.push(nums[i]);
                }
            }
        }

        return ans;
    }
}