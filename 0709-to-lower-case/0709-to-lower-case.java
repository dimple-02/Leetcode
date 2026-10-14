class Solution {
    public String toLowerCase(String s) {
        StringBuilder t = new StringBuilder();
        for(char x : s.toCharArray()){
            if(x>='A' && x<='Z'){
                x+=32;
            }
            t.append(x);
        }
        return t.toString();
    }
}