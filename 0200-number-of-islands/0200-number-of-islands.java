class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n= grid[0].length;
        int count=0;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j,delRow,delCol);
                }
            }
        }
        return count;   
    }

    public void dfs(char[][]grid,int row, int col, int[]delRow, int[] delCol){
        int m = grid.length;
        int n = grid[0].length;
        grid[row][col]='0';
        for(int k=0; k<4; k++){
            int nrow = row+delRow[k];
            int ncol = col+delCol[k];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1'){
                dfs(grid,nrow,ncol,delRow,delCol);
            }
        }
    }
}