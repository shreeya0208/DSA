class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            heap.add(nums[i]);
        }
        int x = heap.poll();
        int y = heap.poll();
        return (x-1)*(y-1);
        
    }
}