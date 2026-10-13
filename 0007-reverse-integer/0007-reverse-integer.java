class Solution {
    public int reverse(int n) {
        int rev=0;
        boolean neg=false;
        if(n<0){
            n=n*(-1);
            neg=true;
        }
        while(n>0){
            int digit=n%10;
             if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            rev=rev*10+n%10;

            n/=10;
        }
        if(neg) rev*=-1;
        return rev;
    }
}
