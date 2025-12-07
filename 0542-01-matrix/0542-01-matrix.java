class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
                    queue.add(new int[]{i,j});
                    result[i][j]=0;
                }
                else{
                    result[i][j]=-1;
                }
            }
        }
        while(!queue.isEmpty()){
            int[] pair = queue.poll();
            int i = pair[0];
            int j= pair[1];
            if(i+1 < m && result[i+1][j]==-1){
                result[i+1][j]=result[i][j]+1;
                queue.add(new int[]{i+1,j});
            }
            if(j+1 <n && result[i][j+1]==-1){
                result[i][j+1]=result[i][j]+1;
                queue.add(new int[]{i,j+1});
            }
            if(i-1 >=0 && result[i-1][j]==-1){
                result[i-1][j]=result[i][j]+1;
                queue.add(new int[]{i-1,j});
            }
            if(j-1>=0 && result[i][j-1]==-1){
                result[i][j-1]=result[i][j]+1;
                queue.add(new int[]{i,j-1});
            }
        }
        return result;
    }
    
}