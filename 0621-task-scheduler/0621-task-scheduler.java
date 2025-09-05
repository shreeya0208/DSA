class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]= new int[26];
        for(char t: tasks){
            freq[t-'A']++;
        }
        PriorityQueue<Integer> heap= new PriorityQueue(Collections.reverseOrder());
        for(int t: freq){
            if(t>0)heap.add(t);
        }
        int time=0;
        while(!heap.isEmpty()){
            int cycle= n+1;
            List<Integer> list = new ArrayList<>();
            while(cycle>0&& !heap.isEmpty()){
            int current = heap.poll();
            if(current>1)list.add(current-1);
            time++;
            cycle--;
        }
        for(int l : list){
            heap.add(l);
        }
        if(!heap.isEmpty()){
            time=time+cycle;
        }
        }
        return time;

        
    }
}