class MedianFinder {
    PriorityQueue <Integer> maxheap;
    PriorityQueue <Integer> minheap;

    public MedianFinder() {
        maxheap= new PriorityQueue<>(Collections.reverseOrder());
        minheap = new PriorityQueue<>();        
    }
    
    public void addNum(int num) {
        if(maxheap.size()==0 || maxheap.peek()>=num){
            maxheap.offer(num);
        }
        else{
            minheap.offer(num);
        }
        balance();
        
    }
    
    public double findMedian() {
        if(maxheap.size() > minheap.size()){
            return maxheap.peek();
        }
        else if(maxheap.size() < minheap.size()){
            return minheap.peek();
        }
        else{
            return (maxheap.peek()+minheap.peek())/2.0;
        }
    }

       public void balance(){
        if(maxheap.size()-minheap.size()>1){
            minheap.offer(maxheap.poll());
        }
        else if(minheap.size()-maxheap.size()>1){
            maxheap.offer(minheap.poll());
        }
       } 
    
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */