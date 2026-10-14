class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[nums.length+1];
        Arrays.fill(arr,-1);
        return helper(nums,nums.length-1,arr);
    }
    int helper(int[] nums, int i, int[] arr){
        if(i<0) return 0;
        if(arr[i]!=-1) return arr[i];
        int rob = helper(nums,i-2,arr)+nums[i];
        int skip=helper(nums,i-1,arr);
        arr[i]=Math.max(rob,skip);
        return arr[i];
    }
}