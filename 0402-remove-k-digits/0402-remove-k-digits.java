class Solution {
    public String removeKdigits(String num, int k) {
	    if(num.length() == k)   return "0";
        int x = k;
        String st = "", ans = "";
        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));
        for(int i = 1; i < num.length(); i++)
        {
            char c = num.charAt(i);
            while(!stack.isEmpty() && c < stack.peek() && k > 0)
            {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k > 0)
        {
            stack.pop();
            k--;
        }

        while(!stack.isEmpty())
        {
            st = st + stack.peek();
            stack.pop();
        }

        for(int i = st.length() - 1; i >= 0; i--)
            ans = ans + st.charAt(i);

        for(int i = 0; i < ans.length(); i++)
        {
            if(ans.charAt(i) != '0')
            {
                ans = ans.substring(i, ans.length());
                break;
            }
        }

        return ans;
    }
}