class Solution {
    public int reverse(int n) {
        int res=0;
        boolean neg=n<0;
        String strX=Integer.toString(Math.abs(n));
        StringBuilder sb = new StringBuilder(strX).reverse();
        try{
            res=Integer.parseInt(sb.toString());
        }
        catch(Exception e){
            return 0;
        }
        return neg ? -res : res;
    }
}
