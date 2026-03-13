class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;

        
    }
    public void helper(int n, int open, int close, List<String>ans, String current){
        if(current.length()==2*n){
            ans.add(current);
            return;
        }
        if(open<n){
            helper(n,open+1,close,ans,current+'(');
        }
        if(close<open){
            helper(n,open,close+1,ans,current+')');
        }
    }
}