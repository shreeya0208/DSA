class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] == b[0]) return b[1] - a[1]; 
                return b[0] - a[0]; 
            }
        );

       
        for (int num : arr) {
            int distance = Math.abs(num - x);
            maxHeap.offer(new int[]{distance, num});
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

       
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll()[1]);
        }
          Collections.sort(result);
        return result;
        
    }
}