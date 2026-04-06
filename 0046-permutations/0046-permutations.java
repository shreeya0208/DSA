class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int[] taken = new int[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(nums,taken,ans,ls);
        return ans;

        
    }
    public void helper(int[] nums, int taken[],  List<List<Integer>> ans,List<Integer> ls){
        if(ls.size()==nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(taken[i]==1)continue;
            taken[i]=1;
            ls.add(nums[i]);
            helper(nums,taken,ans,ls);
            ls.remove(ls.size()-1);
            taken[i]=0;
        }
    }
}