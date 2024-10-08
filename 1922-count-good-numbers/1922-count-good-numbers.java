class Solution {
    public int countGoodNumbers(long n) {
        long ans = 1;
        for(long i = 0; i < n; i++)
        {
            if(i % 2 == 0)
                ans = ans * 5 % (long)(Math.pow(10, 9) + 7);
            else
            ans = ans * 4 % (long)(Math.pow(10, 9) + 7);
        }

        int finalAns = (int)(ans % (Math.pow(10, 9) + 7));
        return finalAns;
    }
}