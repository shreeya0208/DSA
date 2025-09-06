class Solution {
    public String[] findRelativeRanks(int[] score) {
         int n = score.length;
        String[] result = new String[n];

       
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

       
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{score[i], i});
        }
        int rank = n;
        while (!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int index = curr[1];

            if (rank == 1) result[index] = "Gold Medal";
            else if (rank == 2) result[index] = "Silver Medal";
            else if (rank == 3) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(rank);

            rank--;
        }

        return result;
        
    }
}