class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,n,"",0,0);
        return ans;
        

    }
    public void helper(List<String> ans, int n, String current,int open, int close){
        if(current.length()==n*2){
            ans.add(current);
            return;
        }
        if(open<n){
            helper(ans,n,current+'(',open+1,close);
        }
        if(close<open){
            helper(ans,n,current+')',open,close+1);
        }

        

        
    }
}