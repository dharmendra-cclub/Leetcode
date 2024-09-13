class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int hash[] = new int[26];
            Arrays.fill(hash, 0);
            int maxFreq = 0, changes = 0;
            for(int j = i; j < s.length(); j++)
            {
                hash[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);
                changes = (j - i + 1) - maxFreq;
                if(changes <= k)
                    maxLen = Math.max(maxLen, j - i + 1);
                else
                    break;
            }
        }

        return maxLen;
    }
}