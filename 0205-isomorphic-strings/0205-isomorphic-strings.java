class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> a = new HashMap<>();
        HashMap<Character,Character> b = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            if(a.containsKey(x)){
                if(a.get(x)!=y) return false; 
            }
            else a.put(x,y);
            if(b.containsKey(y)){
                if(b.get(y)!=x) return false;
            }
            else b.put(y,x);
        }
        return true;
    }
}