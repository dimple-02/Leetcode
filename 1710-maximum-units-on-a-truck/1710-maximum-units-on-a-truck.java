class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans=0;
        int box=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(int i=0;i<boxTypes.length;i++){
            pq.offer(boxTypes[i]);
        }
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            if(box+curr[0]>truckSize){
                ans+=(truckSize-box)*curr[1];
                box+=truckSize-box;
                break;
            }
            else {
                box+=curr[0];
                ans+=curr[0]*curr[1];
                }
        }
        return ans;
    }
}