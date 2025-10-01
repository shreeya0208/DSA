class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        for(int i: nums1){
            set.add(i);
        }
        for(int i: nums2){
            set1.add(i);
        }
       for(int i: set1){
        if(set.contains(i)){
            ls.add(i);
        }
       }
       int[] arr = new int[ls.size()];
       for(int i=0; i<ls.size(); i++){
        arr[i]=ls.get(i);
       }
       return arr;
        
    }
}