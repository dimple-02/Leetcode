class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int x : piles){
            max=Math.max(max,x);
        }
        int left = 1, right=max;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canFinish(piles,h,mid)) {ans=mid; right=mid-1;}
            else left=mid+1;
        }
        return ans;
    }
    boolean canFinish(int[] piles,int h,int mid){
        int sum=0;
        for(int x : piles){
            sum+=Math.ceil((double)x/mid);
        }
        return sum<=h;
    }
}