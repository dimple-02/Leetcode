class Solution {
    static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
            
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(isPalindrome(s)) return s;
        }
        return "";
    }
}