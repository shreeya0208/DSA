class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length)return -1;
        int start= min(bloomDay);
        int end=max(bloomDay);
        while(start<=end){
            int mid = start+(end-start)/2;
            if(helper(bloomDay,m,k,mid)==true){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public boolean helper(int[] arr, int m, int k, int days ){
        int flowerCount=0;
        int bouquetCount=0;
        for(int i=0; i<arr.length; i++){
            if(days>=arr[i]){
                flowerCount++;
            }
            else{
            bouquetCount+=flowerCount/k;
            flowerCount=0;
            }
        }
         bouquetCount+=flowerCount/k;
         if(bouquetCount>=m)return true;
         return false;
    }
}