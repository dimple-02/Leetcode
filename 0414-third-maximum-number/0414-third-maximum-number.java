class Solution {
    public int thirdMax(int[] nums) {
        int max=nums[0];
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            
            if(max<nums[i]){
                tmax=smax;
                smax=max;
                max=nums[i];
            }
            else if(nums[i]>tmax && nums[i]<smax && nums[i]<max){
                tmax=nums[i];
            }
            else if(nums[i]>tmax && nums[i]>smax && nums[i]<max){
                tmax=smax;
                smax=nums[i];
            }
        }
        if(tmax==Long.MIN_VALUE) return max;
        return (int)tmax;
}
}