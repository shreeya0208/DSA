class Solution {
    public int findCircleNum(int[][] arr ) {
        int m = arr.length;
        int n = arr[0].length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i=0; i<m; i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(arr[i][j]==1 && i!=j){
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }
            int v = adj.size();
            int count=0;
            int[] visited = new int[v];
            for(int i=0; i<v; i++){
                if(visited[i]==0){
                    count++;
                    dfs(i,visited,adj);

                }
            }
            return count;
        
    }

    public void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[node]=1;
        for(int it: adj.get(node)){
            if(visited[it]==0){
                dfs(it,visited,adj);
            }
        }
    }
}