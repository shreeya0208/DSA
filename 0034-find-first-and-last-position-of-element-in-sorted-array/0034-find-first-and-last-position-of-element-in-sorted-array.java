class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left= helperleft(nums,target);
        int right = helperight(nums,target);
        if(left==nums.length || nums[left]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{left,right};
    }
    public int helperleft(int[]nums,int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int helperight(int[] nums, int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>=nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}