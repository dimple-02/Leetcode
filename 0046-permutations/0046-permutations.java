class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] nums,int i,List<Integer> curr){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(!curr.contains(nums[j])){
                curr.add(nums[j]);
                backtrack(nums,i+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}