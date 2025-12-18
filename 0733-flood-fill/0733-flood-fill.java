class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m= image.length;
        int n= image[0].length;
        int init = image[sr][sc];
        if(init==color)return image;
        dfs(image,sr,sc,color,init);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int init){
        int m = image.length;
        int n = image[0].length;
        if(sr<0 || sc<0 || sr>=m || sc>=n)return;
        if(image[sr][sc]!=init)return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,init);
         dfs(image,sr-1,sc,color,init);
          dfs(image,sr,sc+1,color,init);
           dfs(image,sr,sc-1,color,init);
    }
}