class Solution {
    public int splitArray(int[] nums, int k) {
        int start= max(nums);
        int end = sum(nums);
        while(start<=end){
            int mid= start+(end-start)/2;
            if(helper(nums,mid,k)==1){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int max(int[] nums){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        return max;
    }

    public int sum(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        return sum;
    }

    public int helper(int[] nums, int mid, int k){
        int split = 1;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(sum+nums[i]>mid){
                split++;
                sum=nums[i];
                if(split>k)return 0;
            }
            else sum=sum+nums[i];

        }
        return 1;
    }
}