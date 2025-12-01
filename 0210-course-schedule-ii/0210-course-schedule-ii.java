class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b=prerequisites[i][1];
            adj.get(b).add(a);
        }
        int[] indegree = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
         int[] topo = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
            int j=0;
            while(!queue.isEmpty()){
                int node = queue.peek();
                queue.poll();
                topo[j]=node;
                j++;
                for(int it: adj.get(node)){
                    indegree[it]--;
            if(indegree[it]==0)queue.add(it);
        }
                }
                

            
            if(j==numCourses)return topo;
            return new int[]{};
        
    }
}