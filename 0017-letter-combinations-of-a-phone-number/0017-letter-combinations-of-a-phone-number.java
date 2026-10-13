class Solution {
    static String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        backtrack(0, digits, new StringBuilder(), ans);
        return ans;
    }

    void backtrack(int i, String digits, StringBuilder curr, List<String> ans){
        if(i == digits.length()){
            ans.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(i) - '0'];
        for(char ch : letters.toCharArray()){
            curr.append(ch);
            backtrack(i + 1, digits, curr, ans);
            curr.deleteCharAt(curr.length() - 1); 
        }
    }
}