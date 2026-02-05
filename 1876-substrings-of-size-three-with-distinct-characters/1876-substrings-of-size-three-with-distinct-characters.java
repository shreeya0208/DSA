class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()<3)return 0;
        int count=0;
        int i=0;
        int k=3;
        while(i<k){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            i++;
        }
        if(map.size()==k)count++;
        i=0;
        int j=k;
        while(j<s.length()){
            char ch1 = s.charAt(i);
            char ch2= s.charAt(j);
            map.put(ch1,map.getOrDefault(ch1,0)-1);
            if(map.get(ch1)==0)map.remove(ch1);
            map.put(ch2,map.getOrDefault(ch2,0)+1);
            if(map.size()==k)count++;
            i++;
            j++;
        }
            return count;
       }
        
    }
