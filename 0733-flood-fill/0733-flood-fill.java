class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor = image[sr][sc];
        if (initColor == color) return image;
        int[][] ans = image;
        int delRow[] = {-1,0,1,0};
        int delColumn[]={0,1,0,-1};
        dfs(image,ans,sr,sc,color,initColor,delRow,delColumn);
        return ans;

    }
    public void dfs(int[][] image,int[][] ans, int row, int col, int color,int initColor, int delRow[], int delColumn[]){
        ans[row][col]= color;
        int m = image.length;
        int n = image[0].length;
        for(int i=0; i<4; i++){
            int nrow = row+ delRow[i];
            int ncol = col+delColumn[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol]==initColor && ans[nrow][ncol] != color){
                dfs(image,ans,nrow,ncol,color,initColor,delRow,delColumn);
            }
        }
    }
}