class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> ans= new ArrayList<>();
      int[] pcount= new int[26];
      int[] scount= new int[26];
      for(char ch: p.toCharArray()){
        pcount[ch-'a']++;
      }
      int k= p.length();
      for(int i=0; i<s.length(); i++){
        scount[s.charAt(i)-'a']++;
        if(i>=k){
            scount[s.charAt(i-k)-'a']--;
        }
        if(Arrays.equals(scount,pcount)){
            ans.add(i-k+1);
        }
      }
      return ans;
        }

        
    }
