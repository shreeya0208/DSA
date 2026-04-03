class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int val= m*k;
        if(val> bloomDay.length)return -1;
        int start=min(bloomDay);
        int end= max(bloomDay);
        while(start<=end){
            int mid = start+(end-start)/2;
            if(possible(bloomDay,m,k,mid)==true){
                    end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return start;
    }
    public boolean possible(int[] bloomDay, int m, int k, int days){
        int flowercount=0;
        int bouquetcount=0;
        for(int i=0; i<bloomDay.length; i++){
            if(days>=bloomDay[i]){
                flowercount++;
            }
            else{
                bouquetcount += flowercount/k;
               flowercount=0;
            }
        }
         bouquetcount+= flowercount/k;
            if(bouquetcount>=m)return true;
            return false;
    }
    public int max(int[] bloomDay){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        return max;
    }

    public int min(int[] bloomDay){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        return min;
    }
}