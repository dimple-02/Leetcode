class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        int j=0;
        for(int i=left;i<=right;i++){
            if(isPrime(i)) arr.add(i);
        }
        if(arr.size()<2) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        int[] ans=new int[2];
        for(int i=arr.size()-1;i>0;i--){
            if(min>=arr.get(i)-arr.get(i-1)){
                min=arr.get(i)-arr.get(i-1);
                ans[0]=arr.get(i-1);
                ans[1]=arr.get(i);
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