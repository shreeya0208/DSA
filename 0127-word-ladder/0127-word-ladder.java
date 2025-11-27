class Pair{
    String word;
    int level;
    Pair(String word, int level){
        this.word=word;
        this.level=level;
    }
}



class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        queue.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!queue.isEmpty()){
            String word = queue.peek().word;
            int level = queue.peek().level;
            queue.remove();
            if(word.equals(endWord))return level;
            for(int i=0; i<word.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                    char[] charArray = word.toCharArray();
                    charArray[i]=ch;
                    String st = new String(charArray);
                    if(set.contains(st)){
                        set.remove(st);
                        queue.add(new Pair(st,level+1));
                    } 

                }
            }
        }
        return 0;

        
    }
}