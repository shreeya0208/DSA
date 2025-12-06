class Pair{
    int diff, row, column;
    Pair(int diff, int row, int column){
        this.diff = diff;
        this.row=row;
        this.column=column;
    }
}


class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int distance[][] = new int[n][m];
        for(int i=0; i<n; i++){
            Arrays.fill(distance[i],(int)1e9);
        }
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> a.diff-b.diff);
        distance[0][0]=0;
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty()){
            Pair current =pq.poll();
            int d = current.diff;
            int r = current.row;
            int c = current.column;
            if(r==n-1 && c==m-1)return d;
            for(int[] dir: directions){
                int nr = r+dir[0];
                int nc = c+dir[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    int edgeCost = Math.abs(heights[r][c]-heights[nr][nc]);
                    int newEffort = Math.max(d,edgeCost);
                    if(newEffort < distance[nr][nc]){
                        distance[nr][nc]=newEffort;
                        pq.add(new Pair(newEffort,nr,nc));

                    }
                }
            }


        }
        return 0;
        
    }
}