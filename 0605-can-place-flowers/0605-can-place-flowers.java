class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==0){
                int left=0;
                if(i>0){
                    left=flowerbed[i-1];
                }
                int right=0;
                if(i<flowerbed.length-1){
                    right=flowerbed[i+1];
                }
                if(left==0 && right==0){
                    flowerbed[i]=1;
                    count++;
                    if(count>=n)return true;
                }
            }
        }
        return count>=n;
    }
}