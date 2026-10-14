class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int maxGroups=0;
        for(int i=0;i<intervals.length;i++){
            if(pq.size()>0 && pq.peek()<intervals[i][0]){
                pq.poll();
            }
                pq.offer(intervals[i][1]);
                maxGroups=Math.max(maxGroups,pq.size());
        }
        return maxGroups;
    }
}