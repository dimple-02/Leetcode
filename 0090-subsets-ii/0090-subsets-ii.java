class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        backtrack(nums,0,set,new ArrayList<>());
        for(List<Integer> list : set){
            ans.add(list);
        }
        return ans;
    }
    private void backtrack(int[] nums, int i, HashSet<List<Integer>> set, List<Integer> curr){
        if(i==nums.length){
            set.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backtrack(nums,i+1,set,curr);
        curr.remove(curr.size()-1);
        backtrack(nums,i+1,set,curr);
    }
}