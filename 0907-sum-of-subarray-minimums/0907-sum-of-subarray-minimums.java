class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = (int) 1e9 + 7;
        long sum = 0;
        int nse[] = nse(arr);
        int pse[] = psee(arr);

        for(int i = 0; i < arr.length; i++)
        {
            int left = i - pse[i];
            int right = nse[i] - i;
            sum += (long)left * right % mod * arr[i] % mod;
            sum %= mod;
        }

        return (int)sum;
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
}