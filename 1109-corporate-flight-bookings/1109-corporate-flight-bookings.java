class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int[] i : bookings){
            ans[i[0]-1]+=i[2];
            if(i[1]<n) ans[i[1]]-= i[2];
        }
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+ans[i];
        }
        return ans;
    }
}