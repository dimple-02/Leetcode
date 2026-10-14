class Solution {
    public int splitArray(int[] nums, int k) {
        int max=-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            sum+=nums[i];
        }
        int left=max,right=sum;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(can(nums,k,mid)){
                ans=mid; 
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
    boolean can(int[] nums,int k,int mid){
        int req=1;
        int curr=0;
        for(int x : nums){
            if(curr+x<=mid) curr+=x;
            else{
                req++;
                curr=x;
            }
        }
        return req<=k;
    }
}