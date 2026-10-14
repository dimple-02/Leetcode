class Solution {
    public int mirrorDistance(int n) {
        int rev = Integer.parseInt(new StringBuilder(""+n).reverse().toString());
        return (Math.abs(n-rev));
    }
}