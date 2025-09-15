class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Store broken letters in a set for fast lookup
        boolean[] broken = new boolean[26];
        for (char ch : brokenLetters.toCharArray()) {
            broken[ch - 'a'] = true;
        }

        int count = 0;
        String[] words = text.split(" ");  

     
        for (String word : words) {
            boolean canType = true;
            for (char ch : word.toCharArray()) {
                if (broken[ch - 'a']) { 
                    canType = false;
                    break;
                }
            }
            if (canType) count++;  
        }

        return count;
    }
}
