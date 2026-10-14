class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]);    
        });
        int lastEnd=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][1]<=lastEnd){
                count++;
            }
            else{
                lastEnd=intervals[i][1];
            }
        }
        return intervals.length-count;
    }
}