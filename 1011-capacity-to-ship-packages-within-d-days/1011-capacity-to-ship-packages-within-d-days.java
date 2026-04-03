class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int start = max(weights);
      int end = sum(weights);
      while(start <= end){
        int mid = start+(end-start)/2;
        int d = days(weights, days, mid);
        if(d<=days){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
      }
      return start;
    }
    public int max(int[] weights){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }
        return max;
    }

    public int sum(int[] weights){
        int sum=0;
        for(int i=0; i<weights.length; i++){
            sum=sum+weights[i];
        }
        return sum;
    }
    public int days(int[] weights, int days, int capacity){
        int day=1;
        int load=0;
        for(int i=0; i<weights.length; i++){
            if(load+weights[i]>capacity){
                day=day+1;
                load=weights[i];
            }
            else{
                load+= weights[i];
            }
        }
        return day;
    }
}