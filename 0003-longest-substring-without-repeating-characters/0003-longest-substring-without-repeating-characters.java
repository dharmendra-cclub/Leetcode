class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0, maxLength = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int hash[] = new int[255];
            Arrays.fill(hash, 0);
            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(hash[(int)c] == 1) break;
                len = j - i + 1;
                maxLength = Math.max(len, maxLength);
                hash[(int)c] = 1;
            }
        }

        return maxLength;
    }
}