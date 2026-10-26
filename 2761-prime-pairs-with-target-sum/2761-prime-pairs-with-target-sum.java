class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=2;i<=n/2;i++){
            if(isPrime(i) && isPrime(n-i)){
                List<Integer> x= new ArrayList<>();
                x.add(i);
                x.add(n-i);
                ans.add(x);
            }
        }
        return ans;
    }
    private boolean isPrime(int n){
        if(n==0 || n==1 ) return false;
        if(n==2 || n==3 ) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}