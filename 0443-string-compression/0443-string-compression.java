class Solution {
    public int compress(char[] chars) {
        int read=0,write=0;
        for(int i=0;i<chars.length;){
            while(read<chars.length && chars[read]==chars[i]){
                read++;
            }
            chars[write++]=chars[i];
            if(read-i>1){
                String s = String.valueOf(read-i);
                for(int k=0;k<s.length();k++){
                    chars[write++] = s.charAt(k);
                }
            }
            i=read;
        }
        return write;
    }
}