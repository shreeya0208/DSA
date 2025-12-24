class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        int case1 = fun(nums,0,n-2);
        int case2= fun(nums,1,n-1);
        return Math.max(case1,case2);
    }

    public int fun(int[]nums, int start, int end){
        int n = end-start+1;
        int[] dp= new int[n+1];
        dp[0]=nums[start];
        for(int i=1; i<n; i++){
            int pick = nums[start+i];
            if(i>1){
                pick=pick+dp[i-2];
            }
            int notpick = dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[n-1];


    }
}