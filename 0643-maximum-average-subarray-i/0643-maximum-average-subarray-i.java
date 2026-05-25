class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double sum=0;
    double avg=0;
    double maxavg=Double.NEGATIVE_INFINITY;
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
        
        }
                 avg=sum/k;
          maxavg=Math.max(maxavg,avg);
        int left=0;
        int right=k;
       while(right<nums.length){
        sum=sum+nums[right];
        sum=sum-nums[left];
        avg=sum/k;
        maxavg=Math.max(maxavg,avg);
        left++;
        right++;
       }

        return maxavg;
    }
}