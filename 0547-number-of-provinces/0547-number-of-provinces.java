class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
          int n = isConnected[0].length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<m; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(isConnected[i][j]==1 && i!=j){
                adj.get(i).add(j);
                adj.get(j).add(i);
                }
            }
        }
         int V= adj.size();
         int count=0;
         int[] visited = new int[V];
        for(int i=0; i<V; i++){
            if(visited[i]==0)
            count++;
            dfs(visited,i,adj);
        }
        return count;

        
    }
    public void dfs(int[] visited, int node,ArrayList<ArrayList<Integer>> adj ){
        visited[node]=1;
        for(int neigh: adj.get(node)){
            if(visited[neigh]==0){
                dfs(visited,neigh,adj);
            }
        }
    }
}