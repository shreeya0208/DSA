class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,ans,new ArrayList<>(),0);
        return ans;

    }
    public void helper(int[]arr, int target, List<List<Integer>>ans, List<Integer>ds,int    index ){
        if(arr.length==index){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            helper(arr,target-arr[index],ans,ds,index);
            ds.remove(ds.size()-1);
        }
        helper(arr,target,ans,ds,index+1);
    }
}