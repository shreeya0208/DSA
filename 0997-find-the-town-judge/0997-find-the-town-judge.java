class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        // create adjacency list for 1..n
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // fill adjacency list and indegree/outdegree
        for (int[] it : trust) {
            int u = it[0];
            int v = it[1];

            adj.get(u).add(v);   // u → v

            outdegree[u]++;  // u trusts someone
            indegree[v]++;   // v is trusted by someone
        }

        // judge check
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
