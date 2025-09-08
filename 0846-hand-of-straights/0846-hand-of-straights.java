class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0)return false;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i: hand){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue <Integer> heap = new PriorityQueue<>(map.keySet());
        while(!heap.isEmpty()){
            int start = heap.peek();
            for(int i=0; i<groupSize; i++){
                int card = start+i;
                if(!map.containsKey(card))return false;
                map.put(card,map.getOrDefault(card,0)-1);
                if(map.get(card)==0){
                    map.remove(card);
                if(heap.peek()==card){
                    heap.poll();
                }
                }
            }

        }
            return true;       
    }
}