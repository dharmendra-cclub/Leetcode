class Solution {
    //Using library
    // public double myPow(double x, int n) {
    //     return Math.pow(x,n);
    // }

    //Using recursion
    public double myPow(double x, int n) {
        double ans = (n > 0) ? calcPower(x , n) : 1/(calcPower(x , n*(-1)));
        
        return ans;
    }
    public double calcPower(double x, long n)
    {
        if(n == 0)
            return 1;
        if(n % 2 == 1)
            return x * calcPower(x, n-1);
        
        else 
            return calcPower(x * x, n/2);
    }
}