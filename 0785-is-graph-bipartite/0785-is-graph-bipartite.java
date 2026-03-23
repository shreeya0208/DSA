class Solution {
    public boolean isBipartite(int[][] graph) {
        int n= graph.length;
        int[] color= new int[n];
        for(int i=0; i<n; i++){
            color[i]=-1;
        }
        for(int i=0; i<n; i++){
            if(color[i]==-1){
                if(!dfs(graph,color,0,i))return false; 
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph, int[] color, int col, int node){
        color[node]=col;
        for(int i : graph[node]){
            if(color[i]==-1){
                if(!dfs(graph,color,1-col,i)) return false;
            }
            if(color[i]==col)return false;
        }
        return true;
    }
}