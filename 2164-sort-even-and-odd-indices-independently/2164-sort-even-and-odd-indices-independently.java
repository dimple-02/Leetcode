class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len= nums.length;
        List<Integer> even= new ArrayList<>();
        List<Integer> odd= new ArrayList<>();
        
        for(int i=0;i<len;i++){
            if(i%2==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);

        int e=0;int o=0;
        for(int i=0;i<len;i++){
            if(i%2==0) nums[i]=even.get(e++);
            else nums[i]=odd.get(o++);
        }
        return nums;
    }
}