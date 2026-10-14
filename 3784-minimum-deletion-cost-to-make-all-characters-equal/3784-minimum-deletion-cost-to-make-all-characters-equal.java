class Solution {
    public long minCost(String s, int[] cost) {
        long total=0;
        long[] max = new long[26];
        for(int i=0;i<s.length();i++){
            total+=cost[i];
            max[s.charAt(i)-'a']+=cost[i];
        }
        long keep=0;
        for(long v : max) keep= Math.max(keep,v);
        return total-keep;
    }
}