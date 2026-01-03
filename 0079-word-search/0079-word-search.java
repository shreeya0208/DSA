class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,word,0))return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, String word, int index){
         int m = board.length;
        int n = board[0].length;
        if(index==word.length())return true;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(index)|| board[i][j]=='$')return false;
        char temp = board[i][j];
        board[i][j]='$';
        boolean result = dfs(board,i+1,j,word,index+1)||
                        dfs(board,i-1,j,word,index+1)||
                        dfs(board,i,j+1,word,index+1)||
                        dfs(board,i,j-1,word,index+1);

        board[i][j]=temp;
        return result;

    }
}