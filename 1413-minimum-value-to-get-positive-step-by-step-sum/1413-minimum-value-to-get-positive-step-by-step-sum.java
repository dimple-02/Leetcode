class Solution {
    public int minStartValue(int[] nums) {
        int min=nums[0];
        int prefix=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix=nums[i]+prefix;
            if(prefix<min) min=prefix;
        }
        if(min>=0) return 1;
        else return -(min)+1;
    }
}