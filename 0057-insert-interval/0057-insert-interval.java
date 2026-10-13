class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans= new ArrayList<>();
        int newStart=newInterval[0];
        int newEnd=newInterval[1];
        boolean inserted=false;
        for(int i=0;i<intervals.length;i++){
            int[] current=intervals[i];
            if(current[1]<newStart){
                ans.add(current);
                
            }
            else if(current[0]<=newEnd){
                newStart = Math.min(newStart, current[0]);
                newEnd   = Math.max(newEnd, current[1]);
            }
            else{
                if(!inserted){
                    ans.add(new int[]{newStart,newEnd});
                    inserted = true;
                }
                ans.add(current);
            }
        }
        if(!inserted) ans.add(new int[]{newStart,newEnd});
        return ans.toArray(new int[ans.size()][]);
    }
}