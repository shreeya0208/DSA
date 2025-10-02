class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ls = new ArrayList<>();
        String[] arr2 =s2.split(" ");
        String[] arr1 = s1.split(" ");
        Map<String,Integer> map = new HashMap<>();
      
        for(String i: arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i : arr2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i: map.keySet()){
            if(map.get(i)==1){
                ls.add(i);
            }
        }

        
        String[] arr = new String[ls.size()];
        for(int i=0; i<ls.size(); i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}