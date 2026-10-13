class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            
            max=Math.max(right-left+1,max);
            map.put(ch,right);
            right++;
        }
        return max;
    }
}