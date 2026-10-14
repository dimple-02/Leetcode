class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=-1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }
        int left=max,right=sum;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canShip(weights,days,mid)){
                ans=mid; 
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
    boolean canShip(int[] weights,int days,int mid){
        int req=1;
        int curr=0;
        for(int x : weights){
            if(curr+x<=mid) curr+=x;
            else{
                req++;
                curr=x;
            }
        }
        return req<=days;
    }
}