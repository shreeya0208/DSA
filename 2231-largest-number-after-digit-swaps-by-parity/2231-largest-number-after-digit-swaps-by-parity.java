class Solution {
    public int largestInteger(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());

        for (char c : digits) {
            int d = c - '0';
            if (d % 2 == 0) {
                even.offer(d);
            } else {
                odd.offer(d);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : digits) {
            int d = c - '0';
            if (d % 2 == 0) {
                sb.append(even.poll());  
            } else {
                sb.append(odd.poll());  
            }
        }

       
        return Integer.parseInt(sb.toString());
    }
}
