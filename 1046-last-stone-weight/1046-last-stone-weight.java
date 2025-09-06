class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<stones.length; i++){
            heap.add(stones[i]);
        }
        while(heap.size()>1){
            int y = heap.poll();
            int x = heap.poll();
            if(x==y)continue;
            else if(x!=y) heap.add(y-x);
        }
        return !heap.isEmpty()?heap.peek():0;
        
    }
}