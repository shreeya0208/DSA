class Solution {
    public int fillCups(int[] amount) {
          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : amount) {
            if (x > 0) pq.add(x);
        }

        int time = 0;
        while (!pq.isEmpty()) {
            int first = pq.poll();
            int second = 0;

            if (!pq.isEmpty()) {
                second = pq.poll();
            }

          
            first--;
            if (second > 0) second--;

            if (first > 0) pq.add(first);
            if (second > 0) pq.add(second);

            time++;
        }

        return time;
    }
}