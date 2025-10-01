class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int i: nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                ls.add(nums2[i]);
                map.put(nums2[i],map.getOrDefault(nums2[i],0)-1);
                if(map.get(nums2[i])==0) map.remove(nums2[i]);
            }
        }
        int[] arr = new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            arr[i]=ls.get(i);
        }
        return arr;
        
    }
}