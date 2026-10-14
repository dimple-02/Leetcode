class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for(int a : nums){
            ans^=a;
        }
        int diff=ans &(-ans);
        int a =0, b=0;
        for(int x : nums){
            if((x & diff )==0){
                a^=x;
            }
            else b^=x;
        }
        return new int[]{a,b};
    }
}