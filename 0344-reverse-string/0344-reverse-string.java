class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    public void reverse(char[] s,int i, int j)
    {
        if(i > j)  return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
        reverse(s, i, j);
    }
}