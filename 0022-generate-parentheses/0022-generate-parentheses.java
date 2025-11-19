class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        function("",0,0,n,ls);
        return ls;
    }
    public void function(String s, int open, int close, int n, List<String> ls){
        if(s.length()==n*2){
            ls.add(s);
            return;
        }
        if(open<n){
            function(s+'(',open+1,close,n,ls);
        }
        if(close<open){
            function(s+')',open,close+1,n,ls);
        }
    }
}