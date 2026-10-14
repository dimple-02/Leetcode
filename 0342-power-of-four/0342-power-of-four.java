class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0) return false;
        if(Integer.bitCount(n)==1){
            if(Integer.numberOfTrailingZeros(n)%2==0) return true;
        }
        return false;
    }
}