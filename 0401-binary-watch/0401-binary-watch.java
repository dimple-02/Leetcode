class Solution {
    List<String> ans = new ArrayList<>();
    int[] leds= {8,4,2,1,32,16,8,4,2,1};
    public List<String> readBinaryWatch(int turnedOn) {
        backtrack(0,0,0,0,turnedOn);
        return ans;
    }
    void backtrack(int index,int hour, int minute, int count, int turnedOn){
        if(hour>=12 || minute>=60 || count>turnedOn) return;
        if(count==turnedOn){
            ans.add(hour + ":"+(minute<10 ? "0" + minute : minute));
            return;
        }
        if(index==10) return;
        if(index<4)
            backtrack(index+1,hour+leds[index],minute,count+1,turnedOn);
        else 
            backtrack(index+1,hour,minute+leds[index],count+1,turnedOn);
        backtrack(index+1,hour,minute,count,turnedOn);
    }
}