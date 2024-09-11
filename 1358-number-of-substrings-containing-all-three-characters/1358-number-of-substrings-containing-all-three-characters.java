class Solution {
    public int numberOfSubstrings(String s) {
        // int  totalValid = 0;
        // for(int i = 0; i < s.length(); i++)
        // {
        //     int countA = 0, countB = 0, countC = 0;
        //     for(int j = i; j < s.length(); j++)
        //     {
        //         char c = s.charAt(j);
        //         if(c == 'a')    countA++;
        //         else if(c == 'b')    countB++;
        //         else  countC++;

        //         if(countA >= 1 && countB >= 1 && countC >= 1)   totalValid++;
        //     }
        // }

        // return totalValid;


        //Optimal Approach
        int hash[] = new int[3];
        int left = 0, right = 0, count = 0;
        while(right < s.length())
        {
            hash[s.charAt(right) - 'a']++;
            while(hash[0] >= 1 && hash[1] >= 1 && hash[2] >= 1)
            {
                count = count + s.length() - right;
                hash[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }

        return count;
    }
}