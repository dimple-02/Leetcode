class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] nums,int i, List<Integer> curr){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backtrack(nums,i+1,curr);
        curr.remove(curr.size()-1);
        backtrack(nums,i+1,curr);
    }
}