class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            sb.append(new StringBuilder (words[i]).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}