class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        int[][] act = new int[intervals.length][2];
        for(int i=0;i<intervals.length;i++){
            act[i][0]=intervals[i][0];
            act[i][1]=intervals[i][1];
        }
        Arrays.sort(act,(a,b)-> Integer.compare(a[1],b[1]));
        int lastEnd=act[0][1];
        for(int i=1;i<act.length;i++){
            int start=act[i][0];
            if(start>=lastEnd){
                lastEnd=act[i][1];
            }
            else{
                count++;
            }
        }
        return count;
    }
}