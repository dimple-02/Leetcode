class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int f=0;
        for(char c : tasks){
            freq[c-'A']++;
            f=Math.max(f,freq[c-'A']);
        }
        int m=0;
        for(int i : freq){
            if(i==f) m++;
        }
        return Math.max(tasks.length,(f-1)*(n+1)+m);
    }
}