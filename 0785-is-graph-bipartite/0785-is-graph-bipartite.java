class Solution {
    public boolean isBipartite(int[][] graph) {
        int n =  graph.length;
        int[] color = new int[n];
        for(int i=0; i<n; i++){
            if(color[i]!=0){
                continue;
            }
            Queue<Integer>queue = new LinkedList<>();
            queue.add(i);
            color[i]=1;
            while(!queue.isEmpty()){
                int node = queue.poll();
                int[] neighbours = graph[node];
                for(int j=0; j<neighbours.length;j++){
                    int neigh = neighbours[j];
                     if (color[neigh] == 0) {
                        color[neigh] = -color[node]; 
                        queue.offer(neigh);
                    }
                    else if(color[neigh]==color[node])return false;

                }
            }
        }
        return true;
        
    }
}