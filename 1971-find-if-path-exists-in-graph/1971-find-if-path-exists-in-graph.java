class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        } 
        for(int[] neighbour : edges){
            ans.get(neighbour[0]).add(neighbour[1]);
            ans.get(neighbour[1]).add(neighbour[0]);
        }
        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node==destination) return true;
            for(int neighbour : ans.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return false;
    }
}