class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            pq.add(x);
        }
        while(pq.size() > 1){
            if(pq.size()<=1) break;
            pq.add(pq.poll()-pq.poll());
        }
        return pq.poll();
    }
}