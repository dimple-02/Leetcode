class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) o |= nums[i];
        }
        return o;
    }
}