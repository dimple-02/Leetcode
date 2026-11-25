class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums){
            pq.add(x);
        }
        int count=1;
        while(!pq.isEmpty() && count<k){
            pq.poll();
            count++;
        }
        return pq.isEmpty() ? -1 : pq.poll();
    }
}