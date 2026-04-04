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
        List<String> ls= new ArrayList<>();
        helper(new StringBuilder(), digits, ls, 0);
        return ls;

    }
    public void helper(StringBuilder sb, String digits,List<String> ls, int index){
        if(index==digits.length()){
            ls.add(sb.toString());
            return;
        }
        String letters = keypad[digits.charAt(index)-'0'];
        for(char ch: letters.toCharArray()){
            sb.append(ch);
            helper(sb,digits,ls,index+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}