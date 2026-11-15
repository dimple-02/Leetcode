class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target,0,new ArrayList<>());
        return ans;
    }
    void backtrack(int i,int[] candidates, int target, int sum , List<Integer> curr){
        if(target==sum){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==candidates.length || sum>target)return;
        sum+=candidates[i];
        curr.add(candidates[i]);
        backtrack(i,candidates,target,sum,curr);
        curr.remove(curr.size()-1);
        sum-=candidates[i];
        backtrack(i+1,candidates,target,sum,curr);
        
    }
}