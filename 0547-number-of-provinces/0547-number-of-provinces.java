class Solution {
    public int findCircleNum(int[][] isConnected) {
        int total=0;
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
         int V = adj.size();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] visited = new int[V];
            for(int i=0; i<V; i++){
                if(visited[i]==0){
                     total++;
                    dfs(i,adj,visited);
                     
                }

            }
            return total;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj , int[] visited){
        visited[node]=1;
        for(int i : adj.get(node)){
            if(visited[i]==0){
                dfs(i,adj,visited);
            }
        }
    }
}