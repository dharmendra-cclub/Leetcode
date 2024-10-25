class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder copy = new StringBuilder(str);
        StringBuilder st = new StringBuilder(str);
        st = st.reverse();;
        if(st.compareTo(copy) == 0)
            return true;
        else
            return false;
    }
}