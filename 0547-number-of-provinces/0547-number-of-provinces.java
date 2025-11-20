class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if (isConnected[i][j]==1 && i!=j) {
                    adj.get(i).add(j);
                }
        }
    }
    int count=0;
    boolean visited[] = new boolean[n];
    for(int i=0; i<n; i++){
        if(!visited[i]){
            count++;
            dfs(i,adj,visited);
        }
        
    }
    return count;

        
    }
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[node]=true;
        for(Integer i: adj.get(node)){
            if(!visited[i]){
                dfs(i,adj,visited);
            }
        }
    }
}