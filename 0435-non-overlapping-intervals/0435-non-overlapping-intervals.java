class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<intervals.length;i++){
            pq.add(intervals[i]);
        }
        int ans=0;
        int last =Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            if(curr[0]<last) ans++;
            else last = curr[1];
        }
        return ans;
    }
}