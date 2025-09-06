class Solution {
    public String[] findRelativeRanks(int[] score) {
      String[] result = new String[score.length];
      PriorityQueue <Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0; i<score.length; i++){
        heap.add(score[i]);
        map.put(score[i],i);
      }
      int rank=1;
      while(!heap.isEmpty()){
        int current = heap.poll();
        int index= map.get(current);
        if(rank==1)result[index]="Gold Medal";
      else  if(rank==2)result[index]="Silver Medal";
       else if(rank==3)result[index]="Bronze Medal";
       else{
        result[index]=Integer.toString(rank);
       }
       rank++;

      }
      return result;
        
    }
}