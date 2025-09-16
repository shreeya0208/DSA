class Solution {
    public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<gifts.length; i++){
            heap.add(gifts[i]);
        }
        long sum =0;
      for(int i=0; i<k; i++){
        int max = heap.poll();
        int gift =(int)Math.sqrt(max); 
            heap.add(gift);
      }
            for(int i: heap){
                sum=sum+i;
            }
            return sum;
    }
}