class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        function(nums,0,current,ls);
        return ls;
    }
    public void function(int[]nums, int index, List<Integer>current,List<List<Integer>>ls){
        if(index>=nums.length){
            ls.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        function(nums,index+1,current,ls);
        current.remove(current.size()-1);
        function(nums,index+1,current,ls);

    }
}