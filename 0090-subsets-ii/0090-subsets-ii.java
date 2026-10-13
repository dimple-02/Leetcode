class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(0,nums,curr,ans);
        List<List<Integer>> result= new ArrayList<>();
        for(List<Integer> x : ans){
            result.add(x);
        }
        return result;
    }
    void backtrack(int index,int[] nums,List<Integer> curr,HashSet<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(index+1,nums,curr,ans);
        curr.remove(curr.size()-1);
        backtrack(index+1,nums,curr,ans);
    }
}