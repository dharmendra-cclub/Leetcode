class Solution {
    public int characterReplacement(String s, int k) {
        // int maxLen = 0;
        // for(int i = 0; i < s.length(); i++)
        // {
        //     int hash[] = new int[26];
        //     Arrays.fill(hash, 0);
        //     int maxFreq = 0, changes = 0;
        //     for(int j = i; j < s.length(); j++)
        //     {
        //         hash[s.charAt(j) - 'A']++;
        //         maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);
        //         changes = (j - i + 1) - maxFreq;
        //         if(changes <= k)
        //             maxLen = Math.max(maxLen, j - i + 1);
        //         else
        //             break;
        //     }
        // }

        // return maxLen;


        //Optimal Approach
        int left = 0, right = 0, maxLen = 0, maxFreq = 0;
        int hash[] = new int[26];
        Arrays.fill(hash, 0);
        while(right < s.length())
        {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);
            while(right - left + 1 - maxFreq > k)
            {
                hash[s.charAt(left) - 'A']--;
                maxFreq = 0;
                for(int i = 0; i < 26; i++)
                    maxFreq = Math.max(maxFreq, hash[i]);
                left++;
            }
            if(right - left + 1 - maxFreq <= k)
                maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}