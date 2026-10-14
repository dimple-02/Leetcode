class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int w1=0;
        int w2=0;
        while(w1<word1.length() && w2<word2.length()){
            s+=word1.charAt(w1++);
            s+=word2.charAt(w2++);
        }
        while(w1<word1.length()){
            s+=word1.charAt(w1++);
        }
        while(w2<word2.length()){
            s+=word2.charAt(w2++);
        }
        return s;
    }
}