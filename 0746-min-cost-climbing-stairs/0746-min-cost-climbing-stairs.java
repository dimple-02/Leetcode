class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,cost.length -1,dp),helper(cost,cost.length-2,dp));
    }
    private int helper(int[] cost,int i,int[] dp){
        if(i<0) return 0;
        if(i==0 || i==1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        dp[i]=cost[i] + Math.min(helper(cost,i-1,dp),helper(cost,i-2,dp));
        return dp[i];
    }
}