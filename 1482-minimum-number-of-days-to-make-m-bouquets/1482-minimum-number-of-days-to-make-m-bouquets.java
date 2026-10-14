class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int x : bloomDay){
            min=Math.min(x,min);
            max=Math.max(x,max);
        }
        int left=min,right=max,ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canDo(bloomDay,m,k,mid)) {
                ans=mid;
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return ans;
    }
    boolean canDo(int[] bloomDay,int m, int k, int mid){
        int bouquets=0,currentFlowers=0;
        for(int i=0;i<bloomDay.length;i++){
            if (bloomDay[i] <= mid) {
                currentFlowers++;
                if (currentFlowers == k) {
                    bouquets++;
                    currentFlowers = 0;
                }
            } 
            else {
               currentFlowers = 0;
            }
        }
        return bouquets>=m;
    }
}