class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int[] freq = new int[10001];
        int n=barcodes.length;
        int[] ans = new int[n];
        for(int i: barcodes){
            freq[i]++;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
        for (int i = 1; i < 10001; i++) {
            if (freq[i] > 0) {
                pq.offer(new int[]{i,freq[i]});
            }
        }
        int idx=0;
        int[] temp = new int[]{0,0};
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            ans[idx++]=curr[0];
            curr[1]--;
            if(temp[1]>0) pq.offer(new int[]{temp[0],temp[1]});
            temp=curr;
        }
        return ans;
    }
}
