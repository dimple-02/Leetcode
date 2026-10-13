class Solution {
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m = needle.length();
        if(n<m) return -1;
        int[] z = new int[n+m+1];
        int l=0,r=0;
        String str = needle+"$"+haystack;
        int len = str.length();
        for(int i=1;i<len;i++){
            if(i<=r){
                z[i]=Math.min(z[i-l],r-i+1);
            }
            while (i + z[i] < len &&
                   str.charAt(z[i]) == str.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
            if (z[i] == m) {
                return i - m - 1;
            }
        }
        return -1;
    }
}