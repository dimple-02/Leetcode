class Solution {
    public int findComplement(int num) {
        String n = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1') sb.append('0');
            if(n.charAt(i)=='0') sb.append('1');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}