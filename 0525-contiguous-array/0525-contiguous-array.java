class Solution {
    public int findMaxLength(int[] nums) {
        int prefix=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) prefix--;
            else prefix++;
            if(!map.containsKey(prefix)) map.put(prefix,i);
            max=Math.max(max,i-map.get(prefix));
        }
        return max;
    }
}