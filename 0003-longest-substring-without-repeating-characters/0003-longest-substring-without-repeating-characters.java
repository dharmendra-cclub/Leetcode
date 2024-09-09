class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Brute force

        // int len = 0, maxLength = 0;
        // for(int i = 0; i < s.length(); i++)
        // {
        //     int hash[] = new int[255];
        //     Arrays.fill(hash, 0);
        //     for(int j = i; j < s.length(); j++)
        //     {
        //         char c = s.charAt(j);
        //         if(hash[(int)c] == 1) break;
        //         len = j - i + 1;
        //         maxLength = Math.max(len, maxLength);
        //         hash[(int)c] = 1;
        //     }
        // }

        // return maxLength;

        //Optimal approach using two pointer/sliding window

        int left = 0, right = 0;
        int len = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        //map.put(s.charAt(right), 0);
        for(int i = 0; i < s.length(); i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                len = right - left + 1;
                map.put(s.charAt(i), i);
            }
            else
            {
                left = Math.max(map.get(s.charAt(i)) + 1, left);
                len = right - left + 1;
                map.put(s.charAt(i), i);
            }

            maxLen = Math.max(len, maxLen);
            right++;
        }

        return maxLen;
    }
}