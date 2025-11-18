class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        function(0,nums,new ArrayList<>(),ls);
        return ls;

    }
    public void function(int index, int[]nums, List<Integer> current, List<List<Integer>>ls){
        ls.add(new ArrayList<>(current));
        for(int i= index; i<nums.length; i++){
            if(i!=index && nums[i]==nums[i-1])continue;
            current.add(nums[i]);
            function(i+1,nums,current,ls);
            current.remove(current.size()-1);
        }
    }
}