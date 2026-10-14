class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];
        for(int[] i : trips){
            diff[i[1]]+=i[0];
            diff[i[2]]-=i[0];
        }
        if(diff[0]>capacity) return false;
        for(int i=1;i<1001;i++){
            diff[i]=diff[i-1]+diff[i];
            if(capacity<diff[i]) return false;
        }
        return true;
    }
}