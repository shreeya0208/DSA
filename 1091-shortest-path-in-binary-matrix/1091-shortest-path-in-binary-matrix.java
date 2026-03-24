class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n= grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1)return -1;
        grid[0][0]=1;
        int distance=1;
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(0,0));
        
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0; i<size; i++){
                Pair current= queue.poll();
                int r= current.row;
                int c=current.col;
                if(r==n-1 && c==n-1)return distance;
                if(r-1>=0 && grid[r-1][c]==0){
                    queue.add(new Pair(r-1,c));
                    grid[r-1][c]=1;
                }
                if(r+1<n && grid[r+1][c]==0){
                    queue.add(new Pair(r+1,c));
                    grid[r+1][c]=1;
                }
                if(c-1>=0 && grid[r][c-1]==0){
                    queue.add(new Pair(r,c-1));
                    grid[r][c-1]=1;
                }
                 if(c+1<n && grid[r][c+1]==0){
                    queue.add(new Pair(r,c+1));
                    grid[r][c+1]=1;
                }
                 if(r-1>=0 && c-1>=0 && grid[r-1][c-1]==0){
                    queue.add(new Pair(r-1,c-1));
                    grid[r-1][c-1]=1;
                }
                if(r-1>=0 && c+1<n && grid[r-1][c+1]==0){
                    queue.add(new Pair(r-1,c+1));
                    grid[r-1][c+1]=1;
                }
                  if(r+1<n && c-1>=0 && grid[r+1][c-1]==0){
                    queue.add(new Pair(r+1,c-1));
                    grid[r+1][c-1]=1;
                }
                if(r+1<n && c+1<n && grid[r+1][c+1]==0){
                    queue.add(new Pair(r+1,c+1));
                    grid[r+1][c+1]=1;
                }
            }
            distance++;
        }
        return -1;
    }
}