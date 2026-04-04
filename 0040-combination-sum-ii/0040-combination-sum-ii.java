class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,ans,ls,0);
        return ans;
    }
    public void helper(int[]arr, int target,List<List<Integer>> ans,  List<Integer> ls, int index ){
        if(target==0){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=index; i<arr.length; i++){
            if(i>index && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            ls.add(arr[i]);
            helper(arr,target-arr[i],ans,ls, i+1);
            ls.remove(ls.size()-1);
        }
}
}