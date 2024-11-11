class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2 || n == 3)
            return n;
        int p1 = 2, p2 = 3, cur = 0;

        for(int i = 4; i <= n; i++)
        {
            cur = p2 + p1;
            p1 = p2;
            p2 = cur;
        }

        return cur;
    }
}