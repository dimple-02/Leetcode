class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=fn(slow);
        while(slow!=1 && slow!=fast){
            slow=fn(slow);
            fast=fn(fn(fast));
        }
        if(slow==1) return true;
        else return false;
    }
    public int fn(int n){
        if(n==1) return 1;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}