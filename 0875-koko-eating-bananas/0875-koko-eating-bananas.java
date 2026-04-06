class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=0;
        int end=max(piles);
        while(start<=end){
            int mid= start+(end-start)/2;
            int total= totalHours(piles,mid);
            if(h>=total)end=mid-1;
            else{
                start=mid+1;
            }
        }
        return start;
        
    }
    public int max(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++){
            if(piles[i]>max){
                max=piles[i];
            }

        }
        return max;
    }

    public int totalHours(int[] piles, int mid){
        int total=0;
        for(int i=0; i<piles.length; i++){
            total+=Math.ceil((double)piles[i]/(double)mid);
        }
        return total;
    }
}