class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            String x=Integer.toBinaryString(nums[i]);
            if(x.charAt(x.length()-1)=='0') ans++;
            if(ans==2) return true;  
        }
        return false;
    }
}