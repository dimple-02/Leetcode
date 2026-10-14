class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int sum=0;
        int start=0,end=arr.length-1;
        for(int i=start;i<=end;i++){
            for(int j=i;j<=end;j++)
            {if((j- i + 1) % 2 == 1){
                if(i==0){
                    sum+=prefix[j];
                }
                else{
                    sum+=prefix[j]-prefix[i-1];
                }
            }}
        }
        return sum;
    }
}