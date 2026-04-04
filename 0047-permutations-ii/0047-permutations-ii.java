class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] taken= new int[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        Arrays.sort(nums);
        helper(taken,nums,ans,current);
        return ans;
    }
    public void helper(int[] taken, int[] nums, List<List<Integer>> ans, List<Integer> current){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(taken[i]==1)continue;
            if(i>0 && nums[i]==nums[i-1] && taken[i-1]==0)continue;
            taken[i]=1;
            current.add(nums[i]);
            helper(taken,nums,ans,current);
            current.remove(current.size()-1);
            taken[i]=0;
        }
    }
}