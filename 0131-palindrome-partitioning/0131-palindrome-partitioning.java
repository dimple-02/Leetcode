class Solution {
   List<List<String>> ans = new ArrayList<>(); 
    public List<List<String>> partition(String s) {
        backtrack(0,s,new ArrayList<>());
        return ans;
    }
    void backtrack(int index,String s,List<String> curr){
        if(s.length()==index){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
            curr.add(s.substring(index,i+1));
            backtrack(i+1,s,curr);
            curr.remove(curr.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}