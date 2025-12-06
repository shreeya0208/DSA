class Pair{
    int row,column;
    Pair(int row, int column){
        this.row=row;
        this.column=column;
    }
}


class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
            if(grid[0][0]==1|| grid[n-1][n-1]==1)return -1;
            int directions[][]={{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
            Queue<Pair> queue = new LinkedList<Pair>();
            queue.add(new Pair(0,0));
            grid[0][0]=1;
            while(!queue.isEmpty()){
                Pair current = queue.poll();
                int r = current.row;
                int c = current.column;
                  int dist = grid[r][c];
                  if(r==n-1 && c==n-1)return dist;
               
            for(int[] dir : directions){
                int nr = r+ dir[0];
                int nc = c+dir[1];
                if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0){
                    queue.offer(new Pair(nr,nc));
                    grid[nr][nc]=dist+1;
                }

                    
            } 
            }
            return -1;   
    }
}