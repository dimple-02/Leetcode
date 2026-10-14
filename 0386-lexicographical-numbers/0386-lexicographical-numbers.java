class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(i,n,ans);
        }
        return ans;
    }
    void solve(int curr,int n,List<Integer> ans){
        if( curr>n) return;   
        ans.add(curr);
        for(int i=0;i<=9;i++){
            solve(curr*10+i,n,ans);
        }  
    }
}