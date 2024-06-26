class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String ans = "";
        String[] str = s.split(" ");

        for(int i = str.length - 1; i >= 0 ; i--)
            if(str[i].isEmpty() == false)
                ans = ans.concat(str[i] + " ");
            
        ans = ans.trim();

        return ans;
    }
}