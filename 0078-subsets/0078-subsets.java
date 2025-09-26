class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int total = 1<<n;

        for(int num=0; num<total; num++){
            List<Integer> sublist= new ArrayList<>();
            for(int i=0; i<n; i++){
                if((num &(1<<i))!=0){
                    sublist.add(nums[i]);
                }
            }
            result.add(sublist);
        }
        return result;
        
    }
}