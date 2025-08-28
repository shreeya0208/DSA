class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      return  helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[]nums, int k){
        Map <Integer,Integer> map = new HashMap<>();
        int r=0, l=0, count=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])==1)k--;
            while(k<0){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0)k++;
                l++;
            }
            count=count+r-l+1;
              r++;
           
        }
        return count;

    }
}