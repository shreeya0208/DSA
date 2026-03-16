class Solution {
    public static String[] keypad={
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits==null || digits.length()==0) return result;

        helper(new StringBuilder(),digits, result,0);
        return result;
    }
    public static void helper(StringBuilder ans,String digits,List<String>result,int index){
        if(index==digits.length()){
            result.add(ans.toString());
            return;
        }
        String letter= keypad[digits.charAt(index)-'0'];
        for(char ch:letter.toCharArray()){
            ans.append(ch);
            helper(ans,digits,result,index+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}