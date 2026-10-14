class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> p= new ArrayList<>();
        List<Integer> n= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) p.add(nums[i]);
            else n.add(nums[i]);
        }
        int[] arr= new int[nums.length];
        int pi= 0;
        int ni=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) arr[i]=p.get(pi++);
            else arr[i]=n.get(ni++);
        }
        return arr;
    }
}