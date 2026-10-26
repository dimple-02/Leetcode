class Solution {
    public double myPow(double x, int n) {
        long m = n;
        if (m < 0) {
            return 1.0 / pow(x, -m);
        }
        return pow(x, m);
    }
    private double pow(double x , long n){
        if(n==0) return 1.0;
        if(n%2==0){
            return pow(x*x,n/2);
        }
        else return x*pow(x,n-1);
    }
}