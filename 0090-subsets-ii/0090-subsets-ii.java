class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,result,current);
        return result;
    }
    public void helper(int[] nums, int index, List<List<Integer>> result,List<Integer> current){
        result.add(new ArrayList<>(current));
        for(int i= index; i<nums.length; i++){
            if(i>index && nums[i]==nums[i-1])continue;
            current.add(nums[i]);
            helper(nums,i+1,result,current);
            current.remove(current.size()-1);
        }
    }
}