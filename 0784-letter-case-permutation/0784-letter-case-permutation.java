class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        backtrack(0,s,new StringBuilder());
        return ans;
    }
    void backtrack(int index,String s, StringBuilder curr){
        if(index==s.length()){
            ans.add(curr.toString());
            return;
        }
        char ch = s.charAt(index);
        if(Character.isLetter(ch)){
            curr.append(Character.toLowerCase(ch));
            backtrack(index+1,s,curr);
            curr.deleteCharAt(curr.length()-1);

            curr.append(Character.toUpperCase(ch));
            backtrack(index+1,s,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        else{
            curr.append(ch);
            backtrack(index+1,s,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}