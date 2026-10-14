class Solution {
    public int maxScore(String s) {
        int totalOne=0;
        int zero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') totalOne++;
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0') zero++;
            else totalOne--;
            max=Math.max(max,zero+totalOne);
        }
        return max;
        
    }
}