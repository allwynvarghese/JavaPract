package Arrays;

/*
* Given an array of prices of a stock on ith day, return max profit you cn have else return 0
* */

public class MaximumProfit {

    public static int maxProfit(int[] prices){

        int buy = prices[0], profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > buy){
                profit = Math.max(prices[i]-buy, profit);
            }else{
                buy = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
