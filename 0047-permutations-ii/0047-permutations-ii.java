class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(nums,0,new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }
    private void backtrack(int[] nums,int i,List<Integer> curr,boolean[] used){
        if(i==nums.length){
            if(!ans.contains(new ArrayList<>(curr)))
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(used[j])continue;
            else {
                curr.add(nums[j]);
                used[j]=true;
                backtrack(nums,i+1,curr,used);
                curr.remove(curr.size()-1);
                used[j]=false;
            }
        }
    }
}