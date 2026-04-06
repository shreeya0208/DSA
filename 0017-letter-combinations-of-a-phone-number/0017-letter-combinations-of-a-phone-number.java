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
       List<String> ls = new ArrayList<>();
       helper(digits,ls,new StringBuilder(),0);
       return ls;

    }
    public void helper(String digits, List<String> ls, StringBuilder sb, int index){
        if(digits.length()==index){
            ls.add(sb.toString());
            return;
        }
        String letters = keypad[digits.charAt(index)-'0'];
        for(char ch: letters.toCharArray()){
            sb.append(ch);
            helper(digits,ls,sb,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}