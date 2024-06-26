class Solution {
    public String largestOddNumber(String num) {

        long maxOddValue = -1;
        String str = "";
        for(int i = 0; i < num.length(); i++)
        {
            for(int j = i; j < num.length(); j++)
            {
                char c = num.charAt(j);
                str = str + c;
                long x = Long.parseLong(str);
                if(x % 2 != 0 && maxOddValue < x)
                {
                    maxOddValue = x;
                }
            }
            str = "";
        }

        if(maxOddValue == -1)
            return "";
        
        return Long.toString(maxOddValue);
    }
}