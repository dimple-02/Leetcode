class Pair{
    public char ch;
    public int freq;
    public Pair(char ch, int freq){
        this.ch=ch;
        this.freq=freq;
    }
}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> Integer.compare(y.freq,x.freq));
        if(a>0)pq.add(new Pair('a',a));
        if(b>0)pq.add(new Pair('b',b));
        if(c>0)pq.add(new Pair('c',c));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            if(sb.length()>=2 && sb.charAt(sb.length()-2)==curr.ch && sb.charAt(sb.length()-1)==curr.ch){
                if(pq.isEmpty()) return sb.toString();
                Pair curr2=pq.poll();
                sb.append(curr2.ch);
                curr2.freq--;
                if(curr.freq>0)pq.add(curr);
                if(curr2.freq>0) pq.add(curr2); 
            }
            else{
                sb.append(curr.ch);
                curr.freq--;
                if(curr.freq>0)pq.add(curr);
            }
        }
        return sb.toString();
    }
}