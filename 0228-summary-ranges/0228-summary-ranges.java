class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(i < nums.length - 1 && nums[i]==nums[i+1]-1){
                continue;
            }
            else if(j==i){
                sb.append(nums[j]);
               j=i+1;
            }
            else{     
                sb.append(nums[j]);
                sb.append("->");
                sb.append(nums[i]);
                j=i+1;
        }
         ls.add(sb.toString()); 
         sb.setLength(0);

    }
            
         return ls;

}
}