class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        int[] delrow ={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j,delrow,delcol);
                }
            }

        }
        return count;
    }

    public void dfs(char[][] grid, int row, int col, int[] delrow, int[] delcol){
        int m = grid.length;
        int n= grid[0].length;
        grid[row][col]='0';
        for(int k=0; k<4; k++){
            int nr = row + delrow[k];
            int nc = col+ delcol[k];
            if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]=='1'){
                dfs(grid,nr,nc,delrow,delcol);
            }
        }

    }
}