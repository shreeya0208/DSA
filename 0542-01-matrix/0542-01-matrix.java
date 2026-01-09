class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}



class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m= mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        Queue <Pair> queue = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
                    result[i][j]=0;
                    queue.add(new Pair(i,j));
                }
                else{
                    result[i][j]=-1;
                }
            }
        }
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int row = p.first;
            int col = p.second;
            if(row+1<m && result[row+1][col]==-1){
                result[row+1][col]=result[row][col]+1;
                queue.add(new Pair(row+1,col));
            }
            if(col+1<n && result[row][col+1]==-1){
                result[row][col+1]=result[row][col]+1;
                queue.add(new Pair(row,col+1));
            }
            if(row-1>=0 && result[row-1][col]==-1){
                result[row-1][col]=result[row][col]+1;
                queue.add(new Pair(row-1,col));
            }
            if(col-1>=0 && result[row][col-1]==-1){
                result[row][col-1]=result[row][col]+1;
                queue.add(new Pair(row,col-1));
            }
        }
        return result;
        
    }
}