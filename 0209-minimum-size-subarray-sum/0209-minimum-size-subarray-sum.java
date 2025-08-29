class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r=0, l=0, minlen=Integer.MAX_VALUE, sum=0;
        while(r<nums.length){
            sum=sum+nums[r];
            while(sum>=target){
                  minlen=Math.min(minlen,r-l+1);
                sum=sum-nums[l];
                l++;
            }

             r++;     
        } 
       return (minlen == Integer.MAX_VALUE) ? 0 : minlen; 
        
    }
}