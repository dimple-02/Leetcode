class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        char ans = '0';
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()==1){  ans=e.getKey(); break;}
        }
        for(int i=0;i<s.length();i++){
            if(ans==s.charAt(i)) return i;
        }
        return -1;
    }
}