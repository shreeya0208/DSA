class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles>=numExchange){
            int drunk = numBottles/numExchange;
            int empty = numBottles%numExchange;
            sum=sum+drunk;
            numBottles=drunk+empty;
        }
        return sum;
    }
}