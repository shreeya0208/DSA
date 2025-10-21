class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       for(int i=0; i<arr.length; i++){
        while(num>=arr[i]){
        num=num-arr[i];
        sb.append(symbol[i]);
        }
       }
       return sb.toString();
        
    }
}