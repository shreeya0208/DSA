class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n= graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
        }
    
   
   for (int u = 0; u < graph.length; u++) {
    int[] neighbours = graph[u];  
    for (int v : neighbours) {
        adj.get(v).add(u);        
    }
}
         int[] indegree = new int[n];
         for(int i =0; i<n; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
         }
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0; i<n; i++){
                if(indegree[i]==0)queue.add(i);
            }
            List <Integer> ls = new ArrayList<>();
            while(!queue.isEmpty()){
                int node = queue.peek();
                queue.poll();
                ls.add(node);
                for(int it: adj.get(node)){
                    indegree[it]--;
                    if(indegree[it]==0)queue.add(it);
                }
            }
            Collections.sort(ls);
            return ls;

    }
    
}