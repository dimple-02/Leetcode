class Pair {
    char ch;
    int freq;

    Pair(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}
class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for(char a : s.toCharArray()){
            freq[a-'a']++;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.freq, a.freq));
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new Pair((char)(i+'a'),freq[i]));
            }
        }
        StringBuilder sb = new StringBuilder();
        Pair prev= null;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            sb.append(curr.ch);
            curr.freq--;
            if(prev!=null && prev.freq>0) pq.offer(new Pair(prev.ch, prev.freq));
            prev=curr;
        }
        if(prev != null && prev.freq > 0) return "";
        return sb.toString();
    }
}