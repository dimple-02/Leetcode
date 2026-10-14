class Solution {
    public int[] evenOddBit(int n) {
        int[]arr=new int[2];
        String s=Integer.toBinaryString(n);
        char[]c=s.toCharArray();
        int even=0;
        int odd=0;
        int m=c.length;
        for(int i=0;i<c.length;i++){
            if(m%2==0 && c[i]=='1')even++;
            else if(c[i]=='1') odd++;
            m--;
        }
        arr[0]=odd;
        arr[1]=even;
        return arr;
    }
}