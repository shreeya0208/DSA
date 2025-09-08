class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue <>((a,b)->b.getValue()-a.getValue());
        heap.addAll(map.entrySet());       
    
    int[] result = new int[k];
    for(int i=0; i<k; i++){
        result[i]=heap.poll().getKey();
    }
    return result;
    }


}