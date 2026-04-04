class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(nums,result,ls,0);
        return result;
    }
    public void helper(int[] nums, List<List<Integer>> result, List<Integer> ls,int index){
        if(index>=nums.length){
            result.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[index]);
        helper(nums,result,ls,index+1);
        ls.remove(ls.size()-1);
        helper(nums,result,ls,index+1);
    }
}