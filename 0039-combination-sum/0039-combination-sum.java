class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(candidates,target,ans,ls,0);
        return ans;
    }
    public void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> ls, int index ){
        if(candidates.length == index){
            if(target==0){
            ans.add(new ArrayList<>(ls));
            }
            return;
        }
                if(candidates[index]<=target){
                    ls.add(candidates[index]);
                    helper(candidates,target-candidates[index],ans,ls,index);
                    ls.remove(ls.size()-1);
                }
              helper(candidates,target,ans,ls,index+1);

    }
}