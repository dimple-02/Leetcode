class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums){
            pq.add(x);
            if(k<pq.size()) pq.poll();
        }    
        return pq.peek();
    }
}