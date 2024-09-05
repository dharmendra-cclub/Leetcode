class Solution {
    //Brute force
    // public long subArrayRanges(int[] nums) {
    //     long sum = 0;
    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         long min = nums[i];
    //         long max = nums[i];
    //         for(int j = i; j < nums.length; j++)
    //         {
    //             if(min >= nums[j])
    //                 min = nums[j];
    //             if(max <= nums[j])
    //                 max = nums[j];
                
    //             long range = max - min;
    //             sum = sum + range;
    //         }
    //     }

    //     return sum;
    // }

    public long subArrayRanges(int[] nums) {
        long sumMin = 0;
        long sumMax = 0;
        int nse[] = nse(nums);
        int pse[] = psee(nums);
        int nge[] = nge(nums);
        int pge[] = pgee(nums);

        for(int i = 0; i < nums.length; i++)
        {
            int left = i - pse[i];
            int right = nse[i] - i;
            sumMin += left * right * nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            int left = i - pge[i];
            int right = nge[i] - i;
            sumMax += left * right * nums[i];
        }

        return sumMax - sumMin;
    }

    public int[] nse(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        Arrays.fill(ans, arr.length);
        for(int i = arr.length - 1 ; i >=  0; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
                stack.pop();
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(i);
        }
        
        return ans;
    }

    public int[] psee(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        Arrays.fill(ans, -1);
        for(int i = 0; i < arr.length; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(i);
        }
        
        return ans;
    }

    public int[] nge(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        Arrays.fill(ans, arr.length);
        for(int i = arr.length - 1 ; i >=  0; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i])
                stack.pop();
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(i);
        }
        
        return ans;
    }

    public int[] pgee(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        Arrays.fill(ans, -1);
        for(int i = 0; i < arr.length; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            if(!stack.isEmpty())
                ans[i] = stack.peek();
            stack.push(i);
        }
        
        return ans;
    }
}