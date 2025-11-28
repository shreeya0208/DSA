class Solution {
    public boolean isBipartite(int[][] graph) {
      int n = graph.length;
      int[] color = new int[n];
      Arrays.fill(color,-1);
      for(int i=0; i<n; i++){
        if(color[i]==-1){
              if(!function(graph,color,i)) return false;
        }
      }
      return true;
    }
    public boolean function(int[][]graph, int[]color, int i){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        color[i]=0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int neigh: graph[current]){
                if(color[neigh]==-1){
                    color[neigh]=1-color[current];
                    queue.add(neigh);
                }
                else if(color[neigh]==color[current])return false;
            }
        }
        return true;
    }
}