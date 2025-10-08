class Solution {
    public int trap(int[] height) {
       int left=0;
       int right=height.length-1;
       int leftmax=0;
       int rightmax=0;
       int total=0;
       while(left<right){
        if(height[left]<=height[right]){
            if(height[left]<leftmax){
                total=total+leftmax-height[left];
            }
            else{
                leftmax=height[left];
            }
            left=left+1;
        }
        else{
            if(height[right]<rightmax){
                total=total+rightmax-height[right];
            }
            else{
                rightmax=height[right];
            }
            right=right-1;
        }
       }
       return total;
}
}