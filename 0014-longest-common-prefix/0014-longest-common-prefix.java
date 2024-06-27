class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int count = 0;
        char c;
        if(strs.length == 0 || strs[0].isEmpty())
            return "";
        for(int i = 0; i < strs.length; i++)
        {
            if(i < strs[0].length())
            {
                c = strs[0].charAt(i);
            }
            else
                return ans;

            for(int j = 0; j < strs.length; j++)
            {
                if(i < strs[j].length() && strs[j].charAt(i) == c)
                {
                    count++;
                }
                else
                    return ans;
            }
        
            if(count == strs.length)
            {
                ans = ans + c;
            }
            count = 0;
        }

        return ans;
    }
}