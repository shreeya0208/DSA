class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i: prerequisites){
            int u = i[0];
            int v = i[1];
            adj.get(u).add(v);
        }

        int[] indegree = new int[numCourses];
        Queue <Integer> queue = new LinkedList<>();
        ArrayList<Integer> ls = new ArrayList<>();

            for(int i=0; i<numCourses; i++){
                for(int j: adj.get(i)){
                    indegree[j]++;
                }    
            }
            for(int i=0; i<numCourses; i++){
                if(indegree[i]==0)queue.add(i);
            }
            while(!queue.isEmpty()){
                int node = queue.poll();
                ls.add(node);
                for(int i : adj.get(node)){
                    indegree[i]--;
                    if(indegree[i]==0){
                        queue.add(i);
                    }
                }
            }
            if(ls.size()==numCourses)return true;
            return false;
    }
    
}