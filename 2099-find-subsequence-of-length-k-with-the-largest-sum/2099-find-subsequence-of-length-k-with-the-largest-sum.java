class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
       
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.offer(num);
        }

       
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int val = maxHeap.poll();
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

       
        int[] result = new int[k];
        int idx = 0;
        for (int num : nums) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result[idx++] = num;
                freq.put(num, freq.get(num) - 1);
                if (idx == k) break;
            }
        }

        return result;
    }
}