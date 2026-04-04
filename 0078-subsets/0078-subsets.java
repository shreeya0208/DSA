class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ls= new ArrayList<>();
        helper(nums,0,result,ls);
        return result;
    }
    public void helper(int[] nums, int index,   List<List<Integer>> result, List<Integer> ls ){
        if(index >= nums.length){
            result.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[index]);
        helper(nums,index+1,result,ls);
        ls.remove(ls.size()-1);
        helper(nums,index+1,result,ls);
    }
}