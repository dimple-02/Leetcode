class Solution {
    public int largestAltitude(int[] gain) {
        int prefix=0;
        int max=prefix;
        for(int i=0;i<gain.length;i++){
            prefix+=gain[i];
            max=Math.max(prefix,max);
        }
        return max;
    }
}