class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n= image[0].length;
        int initial= image[sr][sc];
        if(image[sr][sc]==color)return image;
        dfs(image,sr,sc,color,initial,m,n);
        return image;


    }
    public void dfs(int[][] image, int sr, int sc, int color, int initial, int m, int n){
        if(sr<0 || sr>=m || sc<0 || sc>=n)return;
        if(image[sr][sc] != initial)return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,initial,m,n);
        dfs(image,sr-1,sc,color,initial,m,n);
        dfs(image,sr,sc+1,color,initial,m,n);
        dfs(image,sr,sc-1,color,initial,m,n);
    }
}